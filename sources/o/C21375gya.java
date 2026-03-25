package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21375gya extends AbstractC32998moE {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public AbstractC16524elZ AEQbTJ;
    public final int EZpvd = C13754dXa.TaskDescription.DIIpTV;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX INFO: renamed from: o.gya$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gya.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C21375gya KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("addressTypeContent", str);
            C21375gya c21375gya = new C21375gya();
            c21375gya.setArguments(bundle);
            return c21375gya;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.AEQbTJ = (AbstractC16524elZ) viewDataBindingBind;
        AEQbTJ();
        view.post(new java.lang.Runnable() { // from class: o.gyd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C21375gya.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final void EZpvd(C21375gya c21375gya) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c21375gya, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("addressTypeContent")) == null) {
            string = "";
        }
        AbstractC16524elZ abstractC16524elZ = this.AEQbTJ;
        AbstractC16524elZ abstractC16524elZ2 = null;
        if (abstractC16524elZ == null) {
            Intrinsics.gEmmrt("");
            abstractC16524elZ = null;
        }
        abstractC16524elZ.EZpvd.setEmptyTypeImage(4);
        AbstractC16524elZ abstractC16524elZ3 = this.AEQbTJ;
        if (abstractC16524elZ3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16524elZ3 = null;
        }
        abstractC16524elZ3.EZpvd.setTitle(C33069mpW.copydefault(C13754dXa.FragmentManager.onSessionReady, C56423yEv.EZpvd(C56390yDp.OLrzqt("type", string))));
        AbstractC16524elZ abstractC16524elZ4 = this.AEQbTJ;
        if (abstractC16524elZ4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16524elZ4 = null;
        }
        abstractC16524elZ4.EZpvd.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaControllerCallback));
        AbstractC16524elZ abstractC16524elZ5 = this.AEQbTJ;
        if (abstractC16524elZ5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16524elZ5 = null;
        }
        abstractC16524elZ5.EZpvd.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hasHeart));
        AbstractC16524elZ abstractC16524elZ6 = this.AEQbTJ;
        if (abstractC16524elZ6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16524elZ2 = abstractC16524elZ6;
        }
        abstractC16524elZ2.EZpvd.setRetryClickListener(new View.OnClickListener() { // from class: o.gye
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C21375gya.OLrzqt(this.AEQbTJ, view);
            }
        });
    }

    public static final void OLrzqt(C21375gya c21375gya, android.view.View view) {
        ActivityC21325gxd.Companion.OLrzqt(true);
        androidx.fragment.app.FragmentManager childFragmentManager = c21375gya.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        new C14461dlr(childFragmentManager, "completeAddress-emptyCoinDetail", null, null, null, false, 60, null).EZpvd();
    }
}
