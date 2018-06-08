package wrathspectre.com.dualink;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ConnectionFragment extends Fragment {

    ConnectionManager connectionManager;
    EditText ip, port;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.connection_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        getActivity().setTitle("Connection");

        ip = view.findViewById(R.id.ip);
        port = view.findViewById(R.id.port);
        Button connect = view.findViewById(R.id.connect);
        new ConnectTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "dd", "dd");

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              new sendTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "dd");
            }
        });
    }

    public class ConnectTask extends AsyncTask<String, String, ConnectionManager> {
        @Override
        protected ConnectionManager doInBackground(String... message) {
            ConnectionManager.ip = "192.168.43.137";
            ConnectionManager.port = 1234;

            connectionManager = ConnectionManager.getInstance();
            connectionManager.run();
            return null;
        }
    }

    public class sendTask extends AsyncTask<String, Void, Void> {
        @Override
        protected Void doInBackground(String... params) {
            connectionManager.send(params[0]);
            return null;
        }
    }

    public class DisconnectTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            connectionManager.stop();
            connectionManager = null;

            return null;
        }
    }
}
