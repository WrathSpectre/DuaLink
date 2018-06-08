package wrathspectre.com.dualink;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class KeyboardFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.keyboard_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Keyboard");
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        view.findViewById(R.id.esc).setOnClickListener(new keyboardClickListener("esc"));
        view.findViewById(R.id.f1).setOnClickListener(new keyboardClickListener("f1"));
        view.findViewById(R.id.f2).setOnClickListener(new keyboardClickListener("f2"));
        view.findViewById(R.id.f3).setOnClickListener(new keyboardClickListener("f3"));
        view.findViewById(R.id.f4).setOnClickListener(new keyboardClickListener("f4"));
        view.findViewById(R.id.f5).setOnClickListener(new keyboardClickListener("f5"));
        view.findViewById(R.id.f6).setOnClickListener(new keyboardClickListener("f6"));
        view.findViewById(R.id.f7).setOnClickListener(new keyboardClickListener("f7"));
        view.findViewById(R.id.f8).setOnClickListener(new keyboardClickListener("f8"));
        view.findViewById(R.id.f9).setOnClickListener(new keyboardClickListener("f9"));
        view.findViewById(R.id.f10).setOnClickListener(new keyboardClickListener("f10"));
        view.findViewById(R.id.f11).setOnClickListener(new keyboardClickListener("f11"));
        view.findViewById(R.id.f12).setOnClickListener(new keyboardClickListener("f12"));
        view.findViewById(R.id.prtscr).setOnClickListener(new keyboardClickListener("prtscr"));
        view.findViewById(R.id.tilde).setOnClickListener(new keyboardClickListener("~"));
        view.findViewById(R.id.one).setOnClickListener(new keyboardClickListener("1"));
        view.findViewById(R.id.two).setOnClickListener(new keyboardClickListener("2"));
        view.findViewById(R.id.three).setOnClickListener(new keyboardClickListener("3"));
        view.findViewById(R.id.four).setOnClickListener(new keyboardClickListener("4"));
        view.findViewById(R.id.five).setOnClickListener(new keyboardClickListener("5"));
        view.findViewById(R.id.six).setOnClickListener(new keyboardClickListener("6"));
        view.findViewById(R.id.seven).setOnClickListener(new keyboardClickListener("7"));
        view.findViewById(R.id.eight).setOnClickListener(new keyboardClickListener("8"));
        view.findViewById(R.id.nine).setOnClickListener(new keyboardClickListener("9"));
        view.findViewById(R.id.zero).setOnClickListener(new keyboardClickListener("0"));
        view.findViewById(R.id.dash).setOnClickListener(new keyboardClickListener("-"));
        view.findViewById(R.id.equal).setOnClickListener(new keyboardClickListener("="));
        view.findViewById(R.id.backspace).setOnClickListener(new keyboardClickListener("backspace"));
        view.findViewById(R.id.tab).setOnClickListener(new keyboardClickListener("tab"));
        view.findViewById(R.id.q).setOnClickListener(new keyboardClickListener("q"));
        view.findViewById(R.id.w).setOnClickListener(new keyboardClickListener("w"));
        view.findViewById(R.id.e).setOnClickListener(new keyboardClickListener("e"));
        view.findViewById(R.id.r).setOnClickListener(new keyboardClickListener("r"));
        view.findViewById(R.id.t).setOnClickListener(new keyboardClickListener("t"));
        view.findViewById(R.id.y).setOnClickListener(new keyboardClickListener("y"));
        view.findViewById(R.id.u).setOnClickListener(new keyboardClickListener("u"));
        view.findViewById(R.id.i).setOnClickListener(new keyboardClickListener("i"));
        view.findViewById(R.id.o).setOnClickListener(new keyboardClickListener("o"));
        view.findViewById(R.id.p).setOnClickListener(new keyboardClickListener("p"));
        view.findViewById(R.id.bracket_left).setOnClickListener(new keyboardClickListener("["));
        view.findViewById(R.id.bracket_right).setOnClickListener(new keyboardClickListener("]"));
        view.findViewById(R.id.back_slash).setOnClickListener(new keyboardClickListener("\""));
        view.findViewById(R.id.capslock).setOnClickListener(new keyboardClickListener("caps"));
        view.findViewById(R.id.a).setOnClickListener(new keyboardClickListener("a"));
        view.findViewById(R.id.s).setOnClickListener(new keyboardClickListener("s"));
        view.findViewById(R.id.d).setOnClickListener(new keyboardClickListener("d"));
        view.findViewById(R.id.f).setOnClickListener(new keyboardClickListener("f"));
        view.findViewById(R.id.g).setOnClickListener(new keyboardClickListener("g"));
        view.findViewById(R.id.h).setOnClickListener(new keyboardClickListener("h"));
        view.findViewById(R.id.j).setOnClickListener(new keyboardClickListener("j"));
        view.findViewById(R.id.k).setOnClickListener(new keyboardClickListener("k"));
        view.findViewById(R.id.l).setOnClickListener(new keyboardClickListener("l"));
        view.findViewById(R.id.semicolon).setOnClickListener(new keyboardClickListener(";"));
        view.findViewById(R.id.quote).setOnClickListener(new keyboardClickListener("'"));
        view.findViewById(R.id.enter).setOnClickListener(new keyboardClickListener("enter"));
        view.findViewById(R.id.shift).setOnClickListener(new keyboardClickListener("shift"));
        view.findViewById(R.id.z).setOnClickListener(new keyboardClickListener("z"));
        view.findViewById(R.id.x).setOnClickListener(new keyboardClickListener("x"));
        view.findViewById(R.id.c).setOnClickListener(new keyboardClickListener("c"));
        view.findViewById(R.id.v).setOnClickListener(new keyboardClickListener("v"));
        view.findViewById(R.id.b).setOnClickListener(new keyboardClickListener("b"));
        view.findViewById(R.id.n).setOnClickListener(new keyboardClickListener("n"));
        view.findViewById(R.id.m).setOnClickListener(new keyboardClickListener("m"));
        view.findViewById(R.id.comma).setOnClickListener(new keyboardClickListener(","));
        view.findViewById(R.id.point).setOnClickListener(new keyboardClickListener("."));
        view.findViewById(R.id.forward_slash).setOnClickListener(new keyboardClickListener("//"));
        view.findViewById(R.id.arrow_up).setOnClickListener(new keyboardClickListener("up"));
        view.findViewById(R.id.ctrl_left).setOnClickListener(new keyboardClickListener("ctrl"));
        view.findViewById(R.id.fn).setOnClickListener(new keyboardClickListener("fn"));
        view.findViewById(R.id.special).setOnClickListener(new keyboardClickListener("super"));
        view.findViewById(R.id.alt_left).setOnClickListener(new keyboardClickListener("alt"));
        view.findViewById(R.id.space).setOnClickListener(new keyboardClickListener(" "));

        view.findViewById(R.id.space).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_layout, new MouseFragment()).commit();

                return true;
            }
        });

        view.findViewById(R.id.alt_right).setOnClickListener(new keyboardClickListener("alt"));
        view.findViewById(R.id.ctrl_right).setOnClickListener(new keyboardClickListener("ctrl"));
        view.findViewById(R.id.arrow_left).setOnClickListener(new keyboardClickListener("left"));
        view.findViewById(R.id.arrow_down).setOnClickListener(new keyboardClickListener("down"));
        view.findViewById(R.id.arrow_right).setOnClickListener(new keyboardClickListener("right"));
    }

    private class keyboardClickListener implements View.OnClickListener {
        private String key;

        private keyboardClickListener(String key) {
            this.key = key;
        }

        @Override
        public void onClick(View v) {
            System.out.println(key);
        }
    }
}
