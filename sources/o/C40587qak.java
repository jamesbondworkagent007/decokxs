package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.dexkline.dex.api.enums.KlineDexPageFromType;
import com.okinc.market.ext.UpDownColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC46605taN;
import o.InterfaceC46612taU;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40587qak extends AbstractC40510qYn<C34964nmQ, C42669ral> {

    /* JADX INFO: renamed from: o.qak$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

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
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42669ral AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42669ral c42669ralOLrzqt = C42669ral.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42669ralOLrzqt, "");
        return c42669ralOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42669ral c42669ral, final int i, @NotNull final C34964nmQ c34964nmQ) {
        int iCopydefault;
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        java.lang.String strGEmmrt3;
        Intrinsics.checkNotNullParameter(c42669ral, "");
        Intrinsics.checkNotNullParameter(c34964nmQ, "");
        C41424qqZ c41424qqZAEQbTJ = c34964nmQ.AEQbTJ();
        java.lang.CharSequence charSequenceAhwBna = c41424qqZAEQbTJ != null ? c41424qqZAEQbTJ.AhwBna() : null;
        C41424qqZ c41424qqZAEQbTJ2 = c34964nmQ.AEQbTJ();
        UpDownColor upDownColorDbNXlk = c41424qqZAEQbTJ2 != null ? c41424qqZAEQbTJ2.DbNXlk() : null;
        C41424qqZ c41424qqZAEQbTJ3 = c34964nmQ.AEQbTJ();
        java.lang.CharSequence charSequenceGEmmrt = c41424qqZAEQbTJ3 != null ? c41424qqZAEQbTJ3.gEmmrt() : null;
        C41424qqZ c41424qqZAEQbTJ4 = c34964nmQ.AEQbTJ();
        java.lang.CharSequence charSequenceAYXKKw = c41424qqZAEQbTJ4 != null ? c41424qqZAEQbTJ4.AYXKKw() : null;
        AppCompatImageView appCompatImageView = c42669ral.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String strKWHzl = C55297xhL.KWHzl(c34964nmQ.copydefault().getTokenLogoUrl(), C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null));
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        C46742tcs.AEQbTJ(appCompatImageView, strKWHzl);
        AppCompatImageView appCompatImageView2 = c42669ral.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        appCompatImageView2.setVisibility(0);
        AppCompatImageView appCompatImageView3 = c42669ral.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
        java.lang.String strKWHzl2 = C55297xhL.KWHzl(c34964nmQ.copydefault().getChainLogoUrl(), C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
        if (strKWHzl2 == null) {
            strKWHzl2 = "";
        }
        C57659ymb.KWHzl(appCompatImageView3, strKWHzl2, C52761wXj.TaskDescription.fERRXa, 0.5f, C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        C42982rgg c42982rgg = c42669ral.copydefault;
        c42982rgg.setData(C56390yDp.OLrzqt(c34964nmQ.copydefault().getTokenSymbol(), ""), C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.DKtBnz)), (charSequenceAYXKKw == null || (strGEmmrt3 = C33129mqd.gEmmrt(charSequenceAYXKKw)) == null) ? "--" : strGEmmrt3, (charSequenceGEmmrt == null || (strGEmmrt2 = C33129mqd.gEmmrt(charSequenceGEmmrt)) == null) ? "--" : strGEmmrt2, (charSequenceAhwBna == null || (strGEmmrt = C33129mqd.gEmmrt(charSequenceAhwBna)) == null) ? "--" : strGEmmrt, (352 & 32) != 0 ? null : null, (352 & 64) != 0 ? null : null, (352 & 128) != 0 ? java.lang.Boolean.FALSE : c34964nmQ.fetchVPNInfo(), (352 & 256) != 0 ? java.lang.Boolean.FALSE : null, (352 & 512) != 0 ? java.lang.Boolean.FALSE : c34964nmQ.OLrzqt(), (352 & 1024) != 0 ? "" : c34964nmQ.EZpvd(), (352 & 2048) != 0 ? null : new Function1() { // from class: o.qaj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40587qak.EZpvd(c42669ral, c34964nmQ, (java.lang.String) obj);
            }
        });
        int i2 = upDownColorDbNXlk == null ? -1 : Activity.EZpvd[upDownColorDbNXlk.ordinal()];
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
        c42669ral.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.qal
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C40587qak.copydefault(c42669ral, c34964nmQ, i, view);
            }
        });
        ConstraintLayout root = c42669ral.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, c42669ral, c34964nmQ));
    }

    public static final Unit EZpvd(C42669ral c42669ral, C34964nmQ c34964nmQ, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "click_tag_icon")) {
            ConstraintLayout root = c42669ral.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            InterfaceC27809kEc interfaceC27809kEcOLrzqt = C27811kEe.OLrzqt(root);
            if (interfaceC27809kEcOLrzqt != null) {
                interfaceC27809kEcOLrzqt.KWHzl(c34964nmQ.copydefault(), "explore_card_dex");
            }
        } else {
            ConstraintLayout root2 = c42669ral.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            InterfaceC27809kEc interfaceC27809kEcOLrzqt2 = C27811kEe.OLrzqt(root2);
            if (interfaceC27809kEcOLrzqt2 != null) {
                interfaceC27809kEcOLrzqt2.AEQbTJ(c34964nmQ.copydefault(), "cedefi", "");
            }
        }
        return Unit.INSTANCE;
    }

    public static final boolean copydefault(C42669ral c42669ral, C34964nmQ c34964nmQ, int i, android.view.View view) {
        ConstraintLayout root = c42669ral.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC46605taN interfaceC46605taNKWHzl = C46607taP.KWHzl(root);
        if (interfaceC46605taNKWHzl == null) {
            return true;
        }
        ConstraintLayout root2 = c42669ral.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        InterfaceC46605taN.TaskDescription.onLongClickInstrument$default(interfaceC46605taNKWHzl, (android.view.View) root2, (InterfaceC41655qus) c34964nmQ, i, false, 8, (java.lang.Object) null);
        return true;
    }

    /* JADX INFO: renamed from: o.qak$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C42669ral AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C34964nmQ KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C42669ral c42669ral, C34964nmQ c34964nmQ) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c42669ral;
            this.KWHzl = c34964nmQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ConstraintLayout root = this.AEQbTJ.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC46612taU interfaceC46612taUEZpvd = C46611taT.EZpvd(root);
                if (interfaceC46612taUEZpvd != null) {
                    InterfaceC46612taU.ActionBar.navToKlinePage$default(interfaceC46612taUEZpvd, null, this.KWHzl, KlineDexPageFromType.EXPLORE_DEX_LIST.getValue(), null, "Explore_Market_Card", 9, null);
                }
            }
        }
    }
}
