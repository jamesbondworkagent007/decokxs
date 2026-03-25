package o;

import com.okinc.crcore.shared.net.responsebean.bsc.ChannelBean;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyF {
    public final lyJ OLrzqt;

    @yCM
    public lyF(@NotNull lyJ lyj) {
        Intrinsics.checkNotNullParameter(lyj, "");
        this.OLrzqt = lyj;
    }

    public final java.lang.Object OLrzqt(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, @NotNull Continuation<? super TaskDescription> continuation) {
        if (Intrinsics.EZpvd((java.lang.Object) channel.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.GOOGLE_PAY.getCode())) {
            return this.OLrzqt.AEQbTJ(channel, continuation);
        }
        return TaskDescription.C0873TaskDescription.KWHzl;
    }

    public final java.lang.Object KWHzl(@NotNull ChannelBean channelBean, @NotNull Continuation<? super TaskDescription> continuation) {
        if (Intrinsics.EZpvd((java.lang.Object) channelBean.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.GOOGLE_PAY.getCode())) {
            return this.OLrzqt.AEQbTJ(lyC.AEQbTJ.AEQbTJ(channelBean), continuation);
        }
        return TaskDescription.C0873TaskDescription.KWHzl;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lyF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: o.lyF$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0873TaskDescription extends TaskDescription {
            public static final C0873TaskDescription KWHzl = new C0873TaskDescription();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0873TaskDescription)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1832855702;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Available";
            }

            private C0873TaskDescription() {
                super(null);
            }
        }

        public static final class Application extends TaskDescription {
            public static final Application OLrzqt = new Application();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1476835076;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ReadyToUse";
            }

            private Application() {
                super(null);
            }
        }

        public static final class Activity extends TaskDescription {
            public static final Activity copydefault = new Activity();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 662415248;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SupportedButNotSetup";
            }

            private Activity() {
                super(null);
            }
        }

        public static final class ActionBar extends TaskDescription {
            public final int KWHzl;
            public final java.lang.String OLrzqt;

            public ActionBar(int i, java.lang.String str) {
                super(null);
                this.KWHzl = i;
                this.OLrzqt = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(int, java.lang.String):void (m)] (LINE:44) call: o.lyF.TaskDescription.ActionBar.<init>(int, java.lang.String):void type: THIS */
            public /* synthetic */ ActionBar(int i, java.lang.String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? null : str);
            }
        }
    }
}
