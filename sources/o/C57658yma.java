package o;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.okinc.rxutils.SubHelper;

/* JADX INFO: renamed from: o.yma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@java.lang.Deprecated
public class C57658yma extends BottomSheetDialogFragment {
    public DialogC57603ylY AYXKKw;

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        DialogC57603ylY dialogC57603ylY = new DialogC57603ylY(getContext(), getTheme());
        this.AYXKKw = dialogC57603ylY;
        return dialogC57603ylY;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@androidx.annotation.NonNull android.content.DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        SubHelper.AEQbTJ(this);
    }
}
