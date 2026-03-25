package o;

import com.okinc.im.imui.group.management.adapter.GroupSettingsAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.owT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C37576owT extends AbstractC32996moC {
    public C33879nJf gEmmrt;
    public final int AYXKKw = C35399nuc.Dialog.RcXXUw;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.owS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37576owT.AYXKKw();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    public final GroupSettingsAdapter gEmmrt() {
        return (GroupSettingsAdapter) this.valueOf.getValue();
    }

    public static final GroupSettingsAdapter AYXKKw() {
        return new GroupSettingsAdapter();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33879nJf c33879nJfKWHzl = C33879nJf.KWHzl(layoutInflater, viewGroup, false);
        this.gEmmrt = c33879nJfKWHzl;
        if (c33879nJfKWHzl == null) {
            Intrinsics.gEmmrt("");
            c33879nJfKWHzl = null;
        }
        android.widget.FrameLayout root = c33879nJfKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C33879nJf c33879nJf = this.gEmmrt;
        if (c33879nJf == null) {
            Intrinsics.gEmmrt("");
            c33879nJf = null;
        }
        c33879nJf.EZpvd.setAdapter(gEmmrt());
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        C33879nJf c33879nJf = this.gEmmrt;
        if (c33879nJf == null) {
            Intrinsics.gEmmrt("");
            c33879nJf = null;
        }
        C55113xdn c55113xdn = c33879nJf.OLrzqt;
        Intrinsics.copydefault(c55113xdn);
        c55113xdn.setVisibility(0);
        C55113xdn.showLoading$default(c55113xdn, 0L, 1, null);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void dismissLoading() {
        C33879nJf c33879nJf = this.gEmmrt;
        if (c33879nJf == null) {
            Intrinsics.gEmmrt("");
            c33879nJf = null;
        }
        C55113xdn c55113xdn = c33879nJf.OLrzqt;
        Intrinsics.copydefault(c55113xdn);
        c55113xdn.setVisibility(8);
        c55113xdn.copydefault();
    }
}
