package o;

import com.okinc.web3Uilib.bean.TransactionReminderInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57430yiK extends android.widget.LinearLayout {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final C57382yhP AEQbTJ;
    public android.graphics.drawable.Drawable OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57430yiK(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57430yiK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt(int i) {
        if (i != 0) {
            if (i == 1) {
                return C52761wXj.Activity.HJWChPQdUnVm;
            }
            if (i == 2) {
                return C52761wXj.Activity.fhUrPt;
            }
        }
        return C52761wXj.Activity.GzAsTt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.yiK.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57430yiK(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57430yiK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57382yhP c57382yhPOLrzqt = C57382yhP.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57382yhPOLrzqt, "");
        this.AEQbTJ = c57382yhPOLrzqt;
        setOrientation(0);
    }

    public final void setReminderBackground(android.graphics.drawable.Drawable drawable) {
        this.OLrzqt = drawable;
        this.AEQbTJ.getRoot().setBackground(drawable);
    }

    public final void setViewDataBean(@NotNull TransactionReminderInfoBean transactionReminderInfoBean) {
        Intrinsics.checkNotNullParameter(transactionReminderInfoBean, "");
        setStyle(transactionReminderInfoBean.getStyle());
        if (transactionReminderInfoBean.getOriginText().length() > 0 || transactionReminderInfoBean.getClickText().length() > 0) {
            this.AEQbTJ.KWHzl.setVisibility(0);
            C57486yjN c57486yjN = this.AEQbTJ.KWHzl;
            java.lang.CharSequence originText = transactionReminderInfoBean.getOriginText();
            java.lang.CharSequence clickText = transactionReminderInfoBean.getClickText();
            int iOLrzqt = OLrzqt(transactionReminderInfoBean.getStyle());
            c57486yjN.setTextAndClickCallback(originText, clickText, java.lang.Integer.valueOf(iOLrzqt), transactionReminderInfoBean.getClickCallback());
            return;
        }
        this.AEQbTJ.KWHzl.setVisibility(8);
    }

    public final void setStyle(int i) {
        KWHzl(i);
        EZpvd(i);
    }

    private final void EZpvd(int i) {
        if (i == 0) {
            this.AEQbTJ.KWHzl.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.GzAsTt));
        } else if (i == 1) {
            this.AEQbTJ.KWHzl.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPQdUnVm));
        } else {
            if (i != 2) {
                return;
            }
            this.AEQbTJ.KWHzl.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fhUrPt));
        }
    }

    private final void KWHzl(int i) {
        if (i == 0) {
            this.AEQbTJ.EZpvd.setImageResource(C52761wXj.TaskDescription.ORWKdN);
            this.AEQbTJ.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
        } else if (i == 1) {
            this.AEQbTJ.EZpvd.setImageResource(C52761wXj.TaskDescription.shErWi);
            this.AEQbTJ.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.HJWChPQdUnVm)));
        } else {
            if (i != 2) {
                return;
            }
            this.AEQbTJ.EZpvd.setImageResource(C52761wXj.TaskDescription.shErWi);
            this.AEQbTJ.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fhUrPt)));
        }
    }

    /* JADX INFO: renamed from: o.yiK$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yiK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
