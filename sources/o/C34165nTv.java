package o;

import com.okinc.im.imui.group.join.CreatePaymentEntryHelper$check$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.model.remote.CreatePaidGroupPaymentRequest;
import com.okinc.okimcore.model.remote.CreatePaidGroupPaymentResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nTv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34165nTv {
    public static final int EZpvd = C44262sJh.AEQbTJ;
    public final C44262sJh KWHzl;

    @yCM
    public C34165nTv(@NotNull C44262sJh c44262sJh) {
        Intrinsics.checkNotNullParameter(c44262sJh, "");
        this.KWHzl = c44262sJh;
    }

    public static /* synthetic */ java.lang.Object check$default(C34165nTv c34165nTv, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return c34165nTv.copydefault(str, str2, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super Activity> continuation) throws java.lang.Throwable {
        CreatePaymentEntryHelper$check$1 createPaymentEntryHelper$check$1;
        java.lang.Object objOLrzqt;
        C34165nTv c34165nTv;
        AbstractC43419rot abstractC43419rot;
        if (continuation instanceof CreatePaymentEntryHelper$check$1) {
            createPaymentEntryHelper$check$1 = (CreatePaymentEntryHelper$check$1) continuation;
            int i = createPaymentEntryHelper$check$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createPaymentEntryHelper$check$1.label = i - Integer.MIN_VALUE;
            } else {
                createPaymentEntryHelper$check$1 = new CreatePaymentEntryHelper$check$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt2 = createPaymentEntryHelper$check$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = createPaymentEntryHelper$check$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt2);
            C44124sEe.imLogGroup$default("CreatePaymentEntryHelper=>check: groupId=" + str + ", inviteId=" + str2 + ", reason=" + str3, null, 2, null);
            InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.copydefault(InterfaceC31257lqc.class);
            createPaymentEntryHelper$check$1.L$0 = this;
            createPaymentEntryHelper$check$1.L$1 = str;
            createPaymentEntryHelper$check$1.L$2 = str2;
            createPaymentEntryHelper$check$1.L$3 = str3;
            createPaymentEntryHelper$check$1.label = 1;
            objOLrzqt = interfaceC31257lqc.OLrzqt(createPaymentEntryHelper$check$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c34165nTv = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt2);
                abstractC43419rot = (AbstractC43419rot) objOLrzqt2;
                C44124sEe.imLogGroup$default("CreatePaymentEntryHelper=>check: Payment creation result=" + abstractC43419rot, null, 2, null);
                if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                    AbstractC43419rot.ActionBar actionBar = (AbstractC43419rot.ActionBar) abstractC43419rot;
                    C44124sEe.AYXKKw("CreatePaymentEntryHelper=>check: Payment creation failed with error: " + actionBar.KWHzl(), (java.lang.Throwable) actionBar.KWHzl());
                    return new Activity.C0892Activity((OKServerException) actionBar.KWHzl());
                }
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC43419rot.StateListAnimator stateListAnimator = (AbstractC43419rot.StateListAnimator) abstractC43419rot;
                C44124sEe.imLogGroup$default("CreatePaymentEntryHelper=>check: Payment creation successful, orderId=" + ((CreatePaidGroupPaymentResponse) stateListAnimator.KWHzl()).getTradeOrderId(), null, 2, null);
                return new Activity.TaskDescription((CreatePaidGroupPaymentResponse) stateListAnimator.KWHzl());
            }
            str3 = (java.lang.String) createPaymentEntryHelper$check$1.L$3;
            str2 = (java.lang.String) createPaymentEntryHelper$check$1.L$2;
            str = (java.lang.String) createPaymentEntryHelper$check$1.L$1;
            c34165nTv = (C34165nTv) createPaymentEntryHelper$check$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt2);
            objOLrzqt = ((Result) objOLrzqt2).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        boolean zEZpvd = Intrinsics.EZpvd(objOLrzqt, C56443yFo.KWHzl(true));
        C44124sEe.imLogGroup$default("CreatePaymentEntryHelper=>check: hasPayAccount=" + zEZpvd, null, 2, null);
        if (!zEZpvd) {
            C44124sEe.imLogGroup$default("CreatePaymentEntryHelper=>check: No smart account found, returning CreateAccount", null, 2, null);
            return Activity.Application.AEQbTJ;
        }
        CreatePaidGroupPaymentRequest createPaidGroupPaymentRequest = new CreatePaidGroupPaymentRequest(C33129mqd.valueOf(str), str2, str3);
        C44124sEe.imLogGroup$default("CreatePaymentEntryHelper=>check: Creating payment with request=" + createPaidGroupPaymentRequest, null, 2, null);
        C44262sJh c44262sJh = c34165nTv.KWHzl;
        createPaymentEntryHelper$check$1.L$0 = null;
        createPaymentEntryHelper$check$1.L$1 = null;
        createPaymentEntryHelper$check$1.L$2 = null;
        createPaymentEntryHelper$check$1.L$3 = null;
        createPaymentEntryHelper$check$1.label = 2;
        objOLrzqt2 = c44262sJh.OLrzqt(createPaidGroupPaymentRequest, createPaymentEntryHelper$check$1);
        if (objOLrzqt2 == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) objOLrzqt2;
        C44124sEe.imLogGroup$default("CreatePaymentEntryHelper=>check: Payment creation result=" + abstractC43419rot, null, 2, null);
        if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
        }
    }

    /* JADX INFO: renamed from: o.nTv$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nTv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.nTv$Activity$Application */
        public static final class Application extends Activity {
            public static final Application AEQbTJ = new Application();

            private Application() {
                super(null);
            }
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.nTv$Activity$TaskDescription */
        public static final class TaskDescription extends Activity {
            public static final int KWHzl = CreatePaidGroupPaymentResponse.$stable;
            public final CreatePaidGroupPaymentResponse AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, CreatePaidGroupPaymentResponse createPaidGroupPaymentResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    createPaidGroupPaymentResponse = taskDescription.AEQbTJ;
                }
                return taskDescription.OLrzqt(createPaidGroupPaymentResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CreatePaidGroupPaymentResponse AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(@NotNull CreatePaidGroupPaymentResponse createPaidGroupPaymentResponse) {
                Intrinsics.checkNotNullParameter(createPaidGroupPaymentResponse, "");
                return new TaskDescription(createPaidGroupPaymentResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.AEQbTJ, ((TaskDescription) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(data=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull CreatePaidGroupPaymentResponse createPaidGroupPaymentResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(createPaidGroupPaymentResponse, "");
                this.AEQbTJ = createPaidGroupPaymentResponse;
            }
        }

        /* JADX INFO: renamed from: o.nTv$Activity$Activity, reason: collision with other inner class name */
        public static final class C0892Activity extends Activity {
            public static final int KWHzl = OKServerException.$stable;
            public final OKServerException EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0892Activity copy$default(C0892Activity c0892Activity, OKServerException oKServerException, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    oKServerException = c0892Activity.EZpvd;
                }
                return c0892Activity.OLrzqt(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKServerException KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0892Activity OLrzqt(@NotNull OKServerException oKServerException) {
                Intrinsics.checkNotNullParameter(oKServerException, "");
                return new C0892Activity(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0892Activity) && Intrinsics.EZpvd(this.EZpvd, ((C0892Activity) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(error=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0892Activity(@NotNull OKServerException oKServerException) {
                super(null);
                Intrinsics.checkNotNullParameter(oKServerException, "");
                this.EZpvd = oKServerException;
            }
        }
    }
}
