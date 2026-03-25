package o;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jgv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26684jgv {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public C26683jgu AEQbTJ;
    public final boolean EZpvd;
    public long KWHzl;

    /* JADX INFO: renamed from: o.jgv$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestAction.values().length];
            try {
                iArr[InvestAction.Subscription.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InvestAction.Redeem.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestAction.Claim.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    public C26684jgv(@NotNull C26683jgu c26683jgu, boolean z) {
        Intrinsics.checkNotNullParameter(c26683jgu, "");
        this.AEQbTJ = c26683jgu;
        this.EZpvd = z;
        this.KWHzl = java.lang.System.currentTimeMillis();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.jgu)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(o.jgu, boolean):void (m)] (LINE:18) call: o.jgv.<init>(o.jgu, boolean):void type: THIS */
    public /* synthetic */ C26684jgv(C26683jgu c26683jgu, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c26683jgu, (i & 2) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: o.jgv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jgv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static /* synthetic */ void updateParams$default(C26684jgv c26684jgv, java.lang.Long l, java.lang.Long l2, InvestAction investAction, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            l2 = null;
        }
        if ((i & 4) != 0) {
            investAction = null;
        }
        c26684jgv.copydefault(l, l2, investAction);
    }

    public final void copydefault(java.lang.Long l, java.lang.Long l2, InvestAction investAction) {
        C26683jgu c26683jgu = this.AEQbTJ;
        long jLongValue = l != null ? l.longValue() : c26683jgu.AEQbTJ();
        long jLongValue2 = l2 != null ? l2.longValue() : this.AEQbTJ.KWHzl();
        if (investAction == null) {
            investAction = this.AEQbTJ.EZpvd();
        }
        this.AEQbTJ = C26683jgu.copy$default(c26683jgu, jLongValue, jLongValue2, null, investAction, 4, null);
    }

    public final java.lang.String djBIcL(TransactionStage transactionStage) {
        return transactionStage == TransactionStage.CONFIRMATION ? "YieldRedeemConfirm_Full_Page_View" : "YieldRedeemNumpad_Full_Page_View";
    }

    public final java.lang.String copydefault(TransactionStage transactionStage) {
        return transactionStage == TransactionStage.CONFIRMATION ? "YieldDepositConfirm_Full_Page_View" : "YieldDepositNumpad_Full_Page_View";
    }

    public final java.lang.String KWHzl(TransactionStage transactionStage) {
        int i = Activity.KWHzl[this.AEQbTJ.EZpvd().ordinal()];
        if (i != 1) {
            return i != 2 ? "" : djBIcL(transactionStage);
        }
        return copydefault(transactionStage);
    }

    public final java.lang.String EZpvd(TransactionStage transactionStage) {
        return transactionStage == TransactionStage.CONFIRMATION ? "YieldRedeemConfirm_Full_Button_Click" : "YieldRedeemNumpad_Full_Button_Click";
    }

    public final java.lang.String AEQbTJ(TransactionStage transactionStage) {
        return transactionStage == TransactionStage.CONFIRMATION ? "YieldDepositConfirm_Full_Button_Click" : "YieldDepositNumpad_Full_Button_Click";
    }

    public final java.lang.String OLrzqt(TransactionStage transactionStage) {
        int i = Activity.KWHzl[this.AEQbTJ.EZpvd().ordinal()];
        if (i != 1) {
            return i != 2 ? "" : EZpvd(transactionStage);
        }
        return AEQbTJ(transactionStage);
    }

    public final java.lang.String OLrzqt() {
        int i = Activity.KWHzl[this.AEQbTJ.EZpvd().ordinal()];
        return i != 1 ? i != 2 ? "" : "YieldRedeemConfirm_Full_Button_Duration" : "YieldDepositConfirm_Full_Button_Duration";
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull TransactionStage transactionStage, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionStage, "");
        C27570jxg.investEvent$default(OLrzqt(transactionStage), null, new Function1() { // from class: o.jgz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26684jgv.EZpvd(this.AEQbTJ, str, str2, str3, str4, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(C26684jgv c26684jgv, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("investment_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(c26684jgv.AEQbTJ.AEQbTJ())), false);
        eventParamsList.put("chain_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(c26684jgv.AEQbTJ.KWHzl())), false);
        eventParamsList.put("source", c26684jgv.AEQbTJ.OLrzqt(), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        if (str2 != null) {
            eventParamsList.put("network", str2, false);
        }
        if (str3 != null) {
            eventParamsList.put("platform_name", str3, false);
        }
        if (str4 != null) {
            eventParamsList.put("investment_name", str4, false);
        }
        if (c26684jgv.EZpvd) {
            EventParamsList.put$default(eventParamsList, "version", OtpEventTracker.OTP_EVENT_VALUE_NEW, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void gEmmrt(@NotNull TransactionStage transactionStage) {
        Intrinsics.checkNotNullParameter(transactionStage, "");
        C27570jxg.investEvent$default(KWHzl(transactionStage), null, new Function1() { // from class: o.jgA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26684jgv.KWHzl(this.KWHzl, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(C26684jgv c26684jgv, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("source", c26684jgv.AEQbTJ.OLrzqt(), false);
        if (c26684jgv.EZpvd) {
            EventParamsList.put$default(eventParamsList, "version", OtpEventTracker.OTP_EVENT_VALUE_NEW, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        final java.lang.String upToMax$default = pTB.formatUpToMax$default(C33129mqd.EZpvd(java.lang.Double.valueOf((java.lang.System.currentTimeMillis() - this.KWHzl) / 1000.0d)), 1, null, 2, null);
        C27570jxg.investEvent$default(OLrzqt(), null, new Function1() { // from class: o.jgt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26684jgv.copydefault(upToMax$default, this, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(java.lang.String str, C26684jgv c26684jgv, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("duration", C33129mqd.gEmmrt(str), true);
        eventParamsList.put("investment_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(c26684jgv.AEQbTJ.AEQbTJ())), false);
        eventParamsList.put("chain_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(c26684jgv.AEQbTJ.KWHzl())), false);
        eventParamsList.put("source", c26684jgv.AEQbTJ.OLrzqt(), false);
        if (c26684jgv.EZpvd) {
            EventParamsList.put$default(eventParamsList, "version", OtpEventTracker.OTP_EVENT_VALUE_NEW, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final java.lang.String str) {
        final java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        int i = Activity.KWHzl[this.AEQbTJ.EZpvd().ordinal()];
        if (i == 1) {
            str2 = "invest";
        } else if (i == 2) {
            str2 = "redeem";
        } else if (i == 3) {
            str2 = "claim";
        }
        C27570jxg.investEvent$default("YieldDepositSign_Full_Button_Click", null, new Function1() { // from class: o.jgy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26684jgv.copydefault(str2, this, str, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(java.lang.String str, C26684jgv c26684jgv, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", str, true);
        eventParamsList.put("source", c26684jgv.AEQbTJ.OLrzqt(), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str2, true);
        if (c26684jgv.EZpvd) {
            EventParamsList.put$default(eventParamsList, "version", OtpEventTracker.OTP_EVENT_VALUE_NEW, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        C27570jxg.investEvent$default("YieldDepositNumpad_Mid_GetToken_Click", null, new Function1() { // from class: o.jgx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26684jgv.AEQbTJ(this.KWHzl, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(C26684jgv c26684jgv, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (c26684jgv.EZpvd) {
            EventParamsList.put$default(eventParamsList, "version", OtpEventTracker.OTP_EVENT_VALUE_NEW, false, 4, null);
        }
        return Unit.INSTANCE;
    }
}
