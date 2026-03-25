package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eLd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15514eLd extends eKF<C15499eKp> {
    public final AbstractC16905esj EZpvd;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final java.util.Set<java.lang.Integer> KWHzl = yEE.AhwBna(66, 67, 68);

    /* JADX WARN: Illegal instructions before constructor call */
    public C15514eLd(@NotNull AbstractC16905esj abstractC16905esj) {
        Intrinsics.checkNotNullParameter(abstractC16905esj, "");
        android.view.View root = abstractC16905esj.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        AbstractC16867ery abstractC16867ery = abstractC16905esj.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(abstractC16867ery, "");
        super(root, abstractC16867ery, abstractC16905esj.AEQbTJ);
        this.EZpvd = abstractC16905esj;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/eKf;)V */
    @Override // o.eKF
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C15499eKp c15499eKp) {
        int iAEQbTJ;
        Intrinsics.checkNotNullParameter(c15499eKp, "");
        super.copydefault(c15499eKp);
        OLrzqt((C15489eKf) c15499eKp);
        this.EZpvd.copydefault(c15499eKp);
        android.view.View root = AEQbTJ().getRoot();
        if (c15499eKp.KWHzl() == 0) {
            iAEQbTJ = 0;
        } else {
            C15489eKf c15489eKfOLrzqt = AEQbTJ().OLrzqt();
            iAEQbTJ = c15489eKfOLrzqt != null ? c15489eKfOLrzqt.AEQbTJ() : 8;
        }
        root.setVisibility(iAEQbTJ);
        android.widget.TextView textView = this.EZpvd.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((!(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c15499eKp.values()) ^ true) || AEQbTJ(c15499eKp)) ? 8 : 0);
        EZpvd(OLrzqt());
    }

    public final boolean AEQbTJ(C15499eKp c15499eKp) {
        return KWHzl.contains(java.lang.Integer.valueOf(c15499eKp.AuCTel().getTxType()));
    }

    /* JADX INFO: renamed from: o.eLd$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eLd.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
