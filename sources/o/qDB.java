package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.Glide;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qDB extends AbstractC39964qEh<C39994qFk, C42857reN> {
    public final qDN KWHzl;
    public final java.lang.String OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public static final int EZpvd = (int) C55298xhM.dp$default(62, (android.content.Context) null, 1, (java.lang.Object) null);

    public qDB(java.lang.String str, @NotNull qDN qdn) {
        Intrinsics.checkNotNullParameter(qdn, "");
        this.OLrzqt = str;
        this.KWHzl = qdn;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qDB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42857reN AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42857reN c42857reNKWHzl = C42857reN.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42857reNKWHzl, "");
        return c42857reNKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull final C42857reN c42857reN, final int i, @NotNull final C39994qFk c39994qFk) {
        int i2;
        Intrinsics.checkNotNullParameter(c42857reN, "");
        Intrinsics.checkNotNullParameter(c39994qFk, "");
        C41431qqg.AEQbTJ(c42857reN.AhwBna, c39994qFk.AuCTel(), (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qDA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qDB.copydefault(c39994qFk, (android.widget.TextView) obj);
            }
        });
        C41431qqg.AEQbTJ(c42857reN.OLrzqt, c39994qFk.values(), (Function1<? super AppCompatImageView, Unit>) new Function1() { // from class: o.qDD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qDB.AEQbTJ(c39994qFk, c42857reN, (AppCompatImageView) obj);
            }
        });
        C41431qqg.AEQbTJ(c42857reN.copydefault, c39994qFk.fetchVPNInfo(), (Function1<? super AppCompatTextView, Unit>) new Function1() { // from class: o.qDI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qDB.EZpvd(this.KWHzl, c39994qFk, (AppCompatTextView) obj);
            }
        });
        AppCompatTextView appCompatTextView = c42857reN.gEmmrt;
        java.lang.String str = this.OLrzqt;
        if (str == null) {
            i2 = qZH.PendingIntent.siEkQe;
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -1001959400) {
                if (iHashCode == 629738236) {
                    str.equals("popular_searches");
                } else if (iHashCode == 1297255772 && str.equals("most_buyers")) {
                    i2 = qZH.PendingIntent.scanPackages;
                }
                i2 = qZH.PendingIntent.siEkQe;
            } else if (str.equals("most_sellers")) {
                i2 = qZH.PendingIntent.DcMfJKDCKfqPDCfLja;
            }
        }
        java.lang.String strDbNXlk = c39994qFk.DbNXlk();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk)) {
            strDbNXlk = "0";
        }
        appCompatTextView.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", strDbNXlk))));
        final CountDownInfo countDownInfo = c39994qFk.KWHzl().getCountDownInfo();
        if (countDownInfo == null || (countDownInfo.countDownTimeExpire() && countDownInfo.getShowType() != CountDownType.SHOW_EXPECT)) {
            countDownInfo = null;
        }
        if (countDownInfo == null || countDownInfo.getShowType() == CountDownType.SHOW_CANCEL) {
            c42857reN.valueOf.AEQbTJ();
            C41431qqg.AEQbTJ(c42857reN.valueOf, c39994qFk.iwGUEr(), (Function1<? super C42963rgN, Unit>) new Function1() { // from class: o.qDF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return qDB.OLrzqt(c39994qFk, (C42963rgN) obj);
                }
            });
            C41431qqg.AEQbTJ(c42857reN.AYXKKw, c39994qFk.hDKMBd(), (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qDH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return qDB.OLrzqt(c39994qFk, (android.widget.TextView) obj);
                }
            });
        } else {
            C41431qqg.AEQbTJ(c42857reN.valueOf, true, (Function1<? super C42963rgN, Unit>) new Function1() { // from class: o.qDG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return qDB.OLrzqt(countDownInfo, c42857reN, (C42963rgN) obj);
                }
            });
            C41431qqg.AEQbTJ(c42857reN.AYXKKw, true, (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qDJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return qDB.EZpvd(countDownInfo, c42857reN, (android.widget.TextView) obj);
                }
            });
        }
        C41431qqg.AEQbTJ(c42857reN.KWHzl, c39994qFk.getNewProxyInstance(), (Function1<? super AppCompatImageView, Unit>) new Function1() { // from class: o.qDM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qDB.OLrzqt(c39994qFk, c42857reN, this, i, (AppCompatImageView) obj);
            }
        });
        C40499qYc root = c42857reN.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, c42857reN, this, c39994qFk, i));
    }

    public static final Unit copydefault(C39994qFk c39994qFk, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setTextColor(C33070mpX.copydefault(c39994qFk.OLrzqt() <= 3 ? C52761wXj.Activity.gdmIOq : C52761wXj.Activity.QwvEab));
        textView.setText(C33129mqd.gEmmrt(java.lang.Integer.valueOf(c39994qFk.OLrzqt())));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C39994qFk c39994qFk, C42857reN c42857reN, AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "");
        java.lang.String strAEQbTJ = c39994qFk.AEQbTJ();
        java.lang.String strOLrzqt = C55687xoe.AEQbTJ.OLrzqt(C33129mqd.gEmmrt(c39994qFk.EZpvd()));
        if (strAEQbTJ == null || strAEQbTJ.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            strAEQbTJ = strOLrzqt;
        }
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(c42857reN.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrKWHzl, "");
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrKWHzl, strAEQbTJ, "lfit", C55298xhM.dpInt$default(28.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(28.0f, (android.content.Context) null, 1, (java.lang.Object) null)).KWHzl(C52761wXj.TaskDescription.aHXSQp).EZpvd((NN<android.graphics.Bitmap>) new C5401Qh()).EZpvd((android.widget.ImageView) c42857reN.OLrzqt);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(qDB qdb, C39994qFk c39994qFk, AppCompatTextView appCompatTextView) {
        Intrinsics.checkNotNullParameter(appCompatTextView, "");
        qdb.AEQbTJ(appCompatTextView, c39994qFk.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C39994qFk c39994qFk, C42963rgN c42963rgN) {
        Intrinsics.checkNotNullParameter(c42963rgN, "");
        c42963rgN.setText(c39994qFk.AYXKKw());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C39994qFk c39994qFk, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        C41426qqb.setText$default(textView, c39994qFk.djBIcL(), (java.lang.CharSequence) c39994qFk.gEmmrt(), 0, 0, 0, false, 60, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(CountDownInfo countDownInfo, C42857reN c42857reN, C42963rgN c42963rgN) {
        Intrinsics.checkNotNullParameter(c42963rgN, "");
        C42963rgN c42963rgN2 = c42857reN.valueOf;
        Intrinsics.checkNotNullExpressionValue(c42963rgN2, "");
        C27618jyb.EZpvd(countDownInfo, c42963rgN2);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(CountDownInfo countDownInfo, C42857reN c42857reN, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        android.widget.TextView textView2 = c42857reN.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        C27618jyb.KWHzl(countDownInfo, textView2);
        textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C39994qFk c39994qFk, C42857reN c42857reN, qDB qdb, int i, AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "");
        appCompatImageView.setSelected(c39994qFk.AubY());
        AppCompatImageView appCompatImageView2 = c42857reN.KWHzl;
        appCompatImageView2.setOnClickListener(new Activity(appCompatImageView2, 1000L, qdb, c39994qFk, i));
        C55296xhK.EZpvd((android.view.View) appCompatImageView, EZpvd);
        return Unit.INSTANCE;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C39994qFk KWHzl;
        public final /* synthetic */ qDB OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, qDB qdb, C39994qFk c39994qFk, int i) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = qdb;
            this.KWHzl = c39994qFk;
            this.copydefault = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.KWHzl.OLrzqt(this.KWHzl.KWHzl(), this.copydefault, this.KWHzl.AubY());
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ C42857reN KWHzl;
        public final /* synthetic */ C39994qFk OLrzqt;
        public final /* synthetic */ long copydefault;
        public final /* synthetic */ qDB gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C42857reN c42857reN, qDB qdb, C39994qFk c39994qFk, int i) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c42857reN;
            this.gEmmrt = qdb;
            this.OLrzqt = c39994qFk;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C40499qYc root = this.KWHzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qHN qhnOLrzqt = qHO.OLrzqt(root);
                if (qhnOLrzqt != null) {
                    qhnOLrzqt.EZpvd(this.gEmmrt.OLrzqt, C33129mqd.gEmmrt(java.lang.Integer.valueOf(this.OLrzqt.OLrzqt())), "spot", this.OLrzqt.KWHzl().getInstFamily());
                }
                qDN qdn = this.gEmmrt.KWHzl;
                C40499qYc root2 = this.KWHzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "");
                qdn.AEQbTJ(root2, this.OLrzqt.KWHzl(), this.EZpvd, this.gEmmrt.AEQbTJ());
            }
        }
    }
}
