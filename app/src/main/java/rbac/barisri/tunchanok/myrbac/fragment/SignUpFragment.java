package rbac.barisri.tunchanok.myrbac.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rbac.barisri.tunchanok.myrbac.R;

/**
 * Created by Administrator on 6/8/2560.
 */
public class SignUpFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_signup,container,false);
        return view;

    }
} //Main class
