package quyen.nguyenvustore.View.TrangChu.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import quyen.nguyenvustore.R;

public class FragmentChuongTrinhKhuyenMai extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_chuongtrinhkhuyenmai, container, false);
        return view;
    }
}