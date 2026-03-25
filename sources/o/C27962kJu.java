package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.dexkline.dex.api.enums.KlineDexPageFromType;
import com.okinc.market.ext.UpDownColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC46612taU;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kJu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27962kJu extends AbstractC40510qYn<qWK, C42669ral> {
    public static final int AEQbTJ = C41421qqW.KWHzl;
    public final Function2<qWK, java.lang.Integer, Unit> EZpvd;
    public final C41421qqW OLrzqt;

    /* JADX INFO: renamed from: o.kJu$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UpDownColor.values().length];
            try {
                iArr[UpDownColor.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UpDownColor.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super o.qWK, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C27962kJu(@NotNull C41421qqW c41421qqW, Function2<? super qWK, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(c41421qqW, "");
        this.OLrzqt = c41421qqW;
        this.EZpvd = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42669ral AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42669ral c42669ralOLrzqt = C42669ral.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42669ralOLrzqt, "");
        return c42669ralOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42669ral c42669ral, int i, @NotNull final qWK qwk) {
        int iCopydefault;
        java.lang.String string;
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        Intrinsics.checkNotNullParameter(c42669ral, "");
        Intrinsics.checkNotNullParameter(qwk, "");
        C41424qqZ c41424qqZ = (C41424qqZ) this.OLrzqt.copydefault((java.lang.Object) qwk);
        java.lang.CharSequence charSequenceCopydefault = c41424qqZ.copydefault();
        UpDownColor upDownColorOLrzqt = c41424qqZ.OLrzqt();
        java.lang.CharSequence charSequenceKWHzl = c41424qqZ.KWHzl();
        java.lang.CharSequence charSequenceAEQbTJ = c41424qqZ.AEQbTJ();
        AppCompatImageView appCompatImageView = c42669ral.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String strKWHzl = C55297xhL.KWHzl(qwk.copydefault().getTokenLogoUrl(), C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null));
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        C46742tcs.AEQbTJ(appCompatImageView, strKWHzl);
        AppCompatImageView appCompatImageView2 = c42669ral.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        appCompatImageView2.setVisibility(0);
        AppCompatImageView appCompatImageView3 = c42669ral.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
        java.lang.String strKWHzl2 = C55297xhL.KWHzl(qwk.copydefault().getChainLogoUrl(), C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
        if (strKWHzl2 == null) {
            strKWHzl2 = "";
        }
        C57659ymb.KWHzl(appCompatImageView3, strKWHzl2, C52761wXj.TaskDescription.fERRXa, 0.5f, C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        C42982rgg c42982rgg = c42669ral.copydefault;
        c42982rgg.setData(C56390yDp.OLrzqt(qwk.copydefault().getTokenSymbol(), ""), C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.DKtBnz)), (charSequenceAEQbTJ == null || (strGEmmrt2 = C33129mqd.gEmmrt(charSequenceAEQbTJ)) == null) ? "--" : strGEmmrt2, (charSequenceKWHzl == null || (strGEmmrt = C33129mqd.gEmmrt(charSequenceKWHzl)) == null) ? "--" : strGEmmrt, (charSequenceCopydefault == null || (string = pTF.KWHzl.KWHzl(charSequenceCopydefault).toString()) == null) ? "--" : string, (352 & 32) != 0 ? null : null, (352 & 64) != 0 ? null : null, (352 & 128) != 0 ? java.lang.Boolean.FALSE : qwk.copydefault().getVerified(), (352 & 256) != 0 ? java.lang.Boolean.FALSE : null, (352 & 512) != 0 ? java.lang.Boolean.FALSE : qwk.OLrzqt(), (352 & 1024) != 0 ? "" : qwk.EZpvd(), (352 & 2048) != 0 ? null : new Function1() { // from class: o.kJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27962kJu.OLrzqt(c42669ral, qwk, (java.lang.String) obj);
            }
        });
        int i2 = upDownColorOLrzqt == null ? -1 : ActionBar.KWHzl[upDownColorOLrzqt.ordinal()];
        if (i2 == 1) {
            android.content.Context context = c42982rgg.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iCopydefault = C33508mxl.copydefault(context);
        } else if (i2 == 2) {
            android.content.Context context2 = c42982rgg.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iCopydefault = C33508mxl.AEQbTJ(context2);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        }
        c42982rgg.setSubPriceColor(iCopydefault);
        ConstraintLayout root = c42669ral.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this, qwk, i, c42669ral));
    }

    public static final Unit OLrzqt(C42669ral c42669ral, qWK qwk, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "click_tag_icon")) {
            ConstraintLayout root = c42669ral.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            InterfaceC27809kEc interfaceC27809kEcOLrzqt = C27811kEe.OLrzqt(root);
            if (interfaceC27809kEcOLrzqt != null) {
                interfaceC27809kEcOLrzqt.KWHzl(qwk.copydefault(), "explore_card_favorite");
            }
        } else {
            ConstraintLayout root2 = c42669ral.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            InterfaceC27809kEc interfaceC27809kEcOLrzqt2 = C27811kEe.OLrzqt(root2);
            if (interfaceC27809kEcOLrzqt2 != null) {
                interfaceC27809kEcOLrzqt2.AEQbTJ(qwk.copydefault(), "favorite", "");
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kJu$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ qWK AEQbTJ;
        public final /* synthetic */ C27962kJu AYXKKw;
        public final /* synthetic */ C42669ral EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C27962kJu c27962kJu, qWK qwk, int i, C42669ral c42669ral) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AYXKKw = c27962kJu;
            this.AEQbTJ = qwk;
            this.KWHzl = i;
            this.EZpvd = c42669ral;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function2 function2 = this.AYXKKw.EZpvd;
                if (function2 != null) {
                    function2.invoke(this.AEQbTJ, java.lang.Integer.valueOf(this.KWHzl));
                }
                ConstraintLayout root = this.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC46612taU interfaceC46612taUEZpvd = C46611taT.EZpvd(root);
                if (interfaceC46612taUEZpvd != null) {
                    InterfaceC46612taU.ActionBar.navToKlinePage$default(interfaceC46612taUEZpvd, null, this.AEQbTJ, KlineDexPageFromType.EXPLORE_FAVORITE_LIST.getValue(), null, "", 8, null);
                }
            }
        }
    }
}
