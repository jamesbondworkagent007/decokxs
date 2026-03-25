package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.market.ext.UpDownColor;
import com.okinc.trade.arch.util.Quartet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class qMT extends AbstractC40510qYn<InterfaceC41642quf, C42890reu> {
    public static final int AEQbTJ = C41545qso.OLrzqt;
    public final C41545qso EZpvd;
    public final boolean KWHzl;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

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
            OLrzqt = iArr;
        }
    }

    public qMT(@NotNull C41545qso c41545qso, boolean z) {
        Intrinsics.checkNotNullParameter(c41545qso, "");
        this.EZpvd = c41545qso;
        this.KWHzl = z;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42890reu AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42890reu c42890reuKWHzl = C42890reu.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42890reuKWHzl, "");
        return c42890reuKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42890reu c42890reu, int i, @NotNull InterfaceC41642quf interfaceC41642quf) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(c42890reu, "");
        Intrinsics.checkNotNullParameter(interfaceC41642quf, "");
        Quartet quartet = (Quartet) this.EZpvd.EZpvd(interfaceC41642quf);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) quartet.component1();
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) quartet.component2();
        java.lang.CharSequence charSequence3 = (java.lang.CharSequence) quartet.component3();
        UpDownColor upDownColor = (UpDownColor) quartet.component4();
        AppCompatImageView appCompatImageView = c42890reu.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(this.KWHzl ? 0 : 8);
        c42890reu.copydefault.setSelected(interfaceC41642quf.DbNXlk());
        c42890reu.OLrzqt.setSelected(interfaceC41642quf.DbNXlk());
        c42890reu.OLrzqt.setText(charSequence);
        c42890reu.AYXKKw.setText(C33070mpX.AYXKKw(interfaceC41642quf.EZpvd().getStringResId()));
        android.widget.TextView textView = c42890reu.EZpvd;
        if (charSequence2 == null) {
            charSequence2 = "--";
        }
        textView.setText(charSequence2);
        android.widget.TextView textView2 = c42890reu.KWHzl;
        textView2.setText(charSequence3);
        int i2 = upDownColor == null ? -1 : StateListAnimator.OLrzqt[upDownColor.ordinal()];
        if (i2 == 1) {
            android.content.Context context = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iCopydefault = C33508mxl.copydefault(context);
        } else if (i2 == 2) {
            android.content.Context context2 = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iCopydefault = C33508mxl.AEQbTJ(context2);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        }
        textView2.setTextColor(iCopydefault);
        AppCompatImageView appCompatImageView2 = c42890reu.copydefault;
        appCompatImageView2.setOnClickListener(new Activity(appCompatImageView2, 1000L, interfaceC41642quf, c42890reu));
        ConstraintLayout root = c42890reu.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, i, interfaceC41642quf, c42890reu));
    }

    public final int copydefault(InterfaceC41642quf interfaceC41642quf) {
        java.util.List<?> items = getAdapter().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        int i = -1;
        for (java.lang.Object obj : items) {
            if (obj instanceof InterfaceC41642quf) {
                InterfaceC41642quf interfaceC41642quf2 = (InterfaceC41642quf) obj;
                if (Intrinsics.EZpvd((java.lang.Object) interfaceC41642quf2.OLrzqt().getInstType(), (java.lang.Object) interfaceC41642quf.OLrzqt().getInstType())) {
                    i++;
                    Intrinsics.EZpvd((java.lang.Object) interfaceC41642quf2.OLrzqt().getInstId(), (java.lang.Object) interfaceC41642quf.OLrzqt().getInstId());
                }
            }
        }
        return i;
    }

    public java.lang.String KWHzl() {
        return C27989kKu.Companion.djBIcL();
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ InterfaceC41642quf EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C42890reu copydefault;
        public final /* synthetic */ qMT djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, qMT qmt, int i, InterfaceC41642quf interfaceC41642quf, C42890reu c42890reu) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.djBIcL = qmt;
            this.AEQbTJ = i;
            this.EZpvd = interfaceC41642quf;
            this.copydefault = c42890reu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                java.lang.String strKWHzl = this.djBIcL.KWHzl();
                int iCopydefault = Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) C27989kKu.Companion.djBIcL()) ? this.AEQbTJ : this.djBIcL.copydefault(this.EZpvd);
                java.lang.String strGEmmrt = this.EZpvd.gEmmrt();
                boolean z = strGEmmrt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt);
                ConstraintLayout root = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    ConstraintLayout root2 = this.copydefault.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "");
                    qplAEQbTJ.KWHzl(root2, this.EZpvd.OLrzqt(), iCopydefault, strKWHzl, "OPTION", "", !z);
                }
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ InterfaceC41642quf AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C42890reu OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, InterfaceC41642quf interfaceC41642quf, C42890reu c42890reu) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = interfaceC41642quf;
            this.OLrzqt = c42890reu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.AEQbTJ.DbNXlk()) {
                    AppCompatImageView appCompatImageView = this.OLrzqt.copydefault;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                    qKN qknOLrzqt = qKO.OLrzqt(appCompatImageView);
                    if (qknOLrzqt != null) {
                        qknOLrzqt.KWHzl(this.AEQbTJ.OLrzqt());
                        return;
                    }
                    return;
                }
                AppCompatImageView appCompatImageView2 = this.OLrzqt.copydefault;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                qKN qknOLrzqt2 = qKO.OLrzqt(appCompatImageView2);
                if (qknOLrzqt2 != null) {
                    qknOLrzqt2.OLrzqt(this.AEQbTJ.OLrzqt());
                }
            }
        }
    }
}
