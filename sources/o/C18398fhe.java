package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.defi.wallet.icloud.binders.CloudBackupStatusBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18398fhe extends AbstractC14584doH<C18397fhd, C16737epa> {
    public C18398fhe() {
        super(CloudBackupStatusBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16737epa c16737epa, @NotNull C18397fhd c18397fhd) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(c16737epa, "");
        Intrinsics.checkNotNullParameter(c18397fhd, "");
        android.widget.TextView textView = c16737epa.EZpvd;
        if (c18397fhd.OLrzqt() == 0) {
            str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.RequiresApi) + " : " + c18397fhd.KWHzl();
        } else {
            str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.level) + " : " + c18397fhd.KWHzl();
        }
        textView.setText(str);
        textView.setCompoundDrawablePadding(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(textView.getContext(), c18397fhd.OLrzqt() == 0 ? C52761wXj.TaskDescription.dESsmu : C52761wXj.TaskDescription.HJWChPOKBmQNaCIdOM);
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.OJuSTm));
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, C55298xhM.dpInt$default(20.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(20.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        }
        textView.setCompoundDrawablesRelative(drawable, null, null, null);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.fdOvFl));
    }
}
