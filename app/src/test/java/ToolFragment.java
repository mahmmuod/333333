
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a333333.databinding.FragmentToolBinding;

import com.example.a333333.ui.tool.ToolViewModel;



public class ToolFragment extends Fragment {
    private @NonNull FragmentToolBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ToolViewModel toolViewModel =
                new ViewModelProvider(this).get(ToolViewModel.class);

        binding = FragmentToolBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textTool;
        toolViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
