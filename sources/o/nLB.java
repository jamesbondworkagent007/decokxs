package o;

import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nLB extends ViewDataBinding {
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView KWHzl;

    @Bindable
    public GroupMemberInfo OLrzqt;
    public final C35893oHp copydefault;

    public nLB(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, C35893oHp c35893oHp, android.widget.TextView textView) {
        super(obj, view, i);
        this.EZpvd = linearLayout;
        this.copydefault = c35893oHp;
        this.KWHzl = textView;
    }

    public static nLB EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static nLB EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (nLB) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.fXHmeK, viewGroup, z, obj);
    }
}
