package o;

import com.okinc.buysell.domain.GetCashBalanceUseCase$invoke$2;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class lyQ {
    public final InterfaceC31764mDa KWHzl;

    public final java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull TradeType tradeType, java.lang.Integer num, boolean z, @NotNull Continuation<? super TaskDescription> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GetCashBalanceUseCase$invoke$2(this, tradeType, z, str3, str, str4, str2, num, null), continuation);
    }

    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lyQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static final class Application extends TaskDescription {
            public static final int KWHzl = com.okinc.okpaymentapi.data.remote.model.management.Channel.$stable;
            public final com.okinc.okpaymentapi.data.remote.model.management.Channel AEQbTJ;
            public final boolean EZpvd;
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.String str, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = application.copydefault;
                }
                if ((i & 2) != 0) {
                    channel = application.AEQbTJ;
                }
                if ((i & 4) != 0) {
                    z = application.EZpvd;
                }
                return application.EZpvd(str, channel, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application EZpvd(@NotNull java.lang.String str, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Application(str, channel, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && this.EZpvd == application.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.copydefault.hashCode();
                com.okinc.okpaymentapi.data.remote.model.management.Channel channel = this.AEQbTJ;
                return (((iHashCode * 31) + (channel == null ? 0 : channel.hashCode())) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(balance=" + this.copydefault + ", selectedChannel=" + this.AEQbTJ + ", isOnlyOneChannel=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.lang.String str, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
                this.AEQbTJ = channel;
                this.EZpvd = z;
            }
        }

        public static final class Activity extends TaskDescription {
            public final boolean KWHzl;
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.OLrzqt;
                }
                if ((i & 2) != 0) {
                    z = activity.KWHzl;
                }
                return activity.KWHzl(str, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(java.lang.String str, boolean z) {
                return new Activity(str, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && this.KWHzl == activity.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.OLrzqt;
                return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Fail(message=" + this.OLrzqt + ", isOnlyOneChannel=" + this.KWHzl + ")";
            }

            public Activity(java.lang.String str, boolean z) {
                super(null);
                this.OLrzqt = str;
                this.KWHzl = z;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:73) call: o.lyQ.TaskDescription.Activity.<init>(java.lang.String, boolean):void type: THIS */
            public /* synthetic */ Activity(java.lang.String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? false : z);
            }
        }
    }
}
