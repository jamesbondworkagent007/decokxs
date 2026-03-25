package o;

import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.business.defi.biz.net.bean.EosAccountResp;
import com.okinc.business.defi.wallet.connect.viewmodel.DefiWalletTrackerAddressViewModel$checkAddress$1;
import com.okinc.business.defi.wallet.connect.viewmodel.DefiWalletTrackerAddressViewModel$checkENSDomainAsync$1;
import com.okinc.business.defi.wallet.connect.viewmodel.DefiWalletTrackerAddressViewModel$checkEOSAccountAsync$1;
import com.okinc.business.defi.wallet.connect.viewmodel.DefiWalletTrackerAddressViewModel$checkNearAddressAsync$1;
import com.okinc.business.defi.wallet.connect.viewmodel.DefiWalletTrackerAddressViewModel$checkWalletExists$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C12827cuN;
import o.C13092czN;
import o.C16103edc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.edc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16103edc extends AbstractC33073mpa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final C13092czN AEQbTJ;
    public final C12827cuN AYXKKw;
    public final kotlinx.coroutines.channels.Channel<TaskDescription> KWHzl;
    public final C10948byA OLrzqt;
    public final kotlinx.coroutines.channels.Channel<Activity> copydefault;
    public final C13934dbu gEmmrt;

    /* JADX INFO: renamed from: o.edc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.edc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static final C16103edc copydefault(CreationExtras creationExtras) {
            Intrinsics.checkNotNullParameter(creationExtras, "");
            return new C16103edc(new C13934dbu(), C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), C10954byG.EZpvd.valueOf(), C13092czN.Activity.getInstance$default(C13092czN.Companion, null, 1, null));
        }

        public final ViewModelProvider.Factory copydefault() {
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C16103edc.class), new Function1() { // from class: o.ecY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C16103edc.ActionBar.copydefault((CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }

    public C16103edc(@NotNull C13934dbu c13934dbu, @NotNull C12827cuN c12827cuN, @NotNull C10948byA c10948byA, @NotNull C13092czN c13092czN) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c13092czN, "");
        this.gEmmrt = c13934dbu;
        this.AYXKKw = c12827cuN;
        this.OLrzqt = c10948byA;
        this.AEQbTJ = c13092czN;
        this.copydefault = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.KWHzl = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    }

    /* JADX INFO: renamed from: o.edc$Application */
    public static final class Application {
        public final int AEQbTJ;
        public static final ActionBar Companion = new ActionBar(null);
        public static final int OLrzqt = EZpvd(0);
        public static final int EZpvd = EZpvd(1);
        public static final int KWHzl = EZpvd(4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static boolean AEQbTJ(int i, java.lang.Object obj) {
            return (obj instanceof Application) && i == ((Application) obj).copydefault();
        }

        public static final boolean KWHzl(int i) {
            return (i & 4) != 0;
        }

        public static final boolean KWHzl(int i, int i2) {
            return i == i2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static java.lang.String OLrzqt(int i) {
            return "SupportStatus(value=" + i + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static int copydefault(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final /* synthetic */ int copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            return AEQbTJ(this.AEQbTJ, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return copydefault(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return OLrzqt(this.AEQbTJ);
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:4:0x0004 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: int */
        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: int */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: int */
        /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: int */
        /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: int */
        /* JADX WARN: Multi-variable type inference failed */
        public static int AEQbTJ(boolean z, boolean z2, boolean z3) {
            int i = z;
            if (z2) {
                i = (z ? 1 : 0) | 2;
            }
            if (z3) {
                i = (i == true ? 1 : 0) | 4;
            }
            return EZpvd(i);
        }

        public static int EZpvd(int i) {
            if (i >= 0 && i < 8) {
                return i;
            }
            java.lang.String string = java.lang.Integer.toString(i, CharsKt__CharJVMKt.checkRadix(2));
            Intrinsics.checkNotNullExpressionValue(string, "");
            throw new java.lang.IllegalArgumentException(("Value(0b" + string + ") must be in 0b000..0b111").toString());
        }

        /* JADX INFO: renamed from: o.edc$Application$ActionBar */
        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.edc.Application.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }

            public final int KWHzl() {
                return Application.OLrzqt;
            }

            public final int AEQbTJ() {
                return Application.EZpvd;
            }

            public final int copydefault() {
                return Application.KWHzl;
            }
        }
    }

    /* JADX INFO: renamed from: o.edc$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.Long EZpvd;
        public final java.lang.String KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int), (r2v0 java.lang.String), (r3v0 java.lang.Long), (r4v0 java.lang.String) A[MD:(int, java.lang.String, java.lang.Long, java.lang.String):void (m)] call: o.edc.Activity.<init>(int, java.lang.String, java.lang.Long, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(int i, java.lang.String str, java.lang.Long l, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, l, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-0JR8rfQ$default, reason: not valid java name */
        public static /* synthetic */ Activity m8599copy0JR8rfQ$default(Activity activity, int i, java.lang.String str, java.lang.Long l, java.lang.String str2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = activity.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                str = activity.AEQbTJ;
            }
            if ((i2 & 4) != 0) {
                l = activity.EZpvd;
            }
            if ((i2 & 8) != 0) {
                str2 = activity.KWHzl;
            }
            return activity.KWHzl(i, str, l, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(int i, @NotNull java.lang.String str, java.lang.Long l, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(i, str, l, str2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
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
            return Application.KWHzl(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iCopydefault = Application.copydefault(this.OLrzqt);
            int iHashCode = this.AEQbTJ.hashCode();
            java.lang.Long l = this.EZpvd;
            int iHashCode2 = l == null ? 0 : l.hashCode();
            java.lang.String str = this.KWHzl;
            return (((((iCopydefault * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CheckAddressResult(supportStatus=" + Application.OLrzqt(this.OLrzqt) + ", originalAddress=" + this.AEQbTJ + ", singleChainId=" + this.EZpvd + ", ensParsedAddress=" + this.KWHzl + ")";
        }

        public Activity(int i, java.lang.String str, java.lang.Long l, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = i;
            this.AEQbTJ = str;
            this.EZpvd = l;
            this.KWHzl = str2;
        }
    }

    /* JADX INFO: renamed from: o.edc$TaskDescription */
    public interface TaskDescription {

        /* JADX INFO: renamed from: o.edc$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0839TaskDescription implements TaskDescription {
            public final java.lang.String OLrzqt;
            public final long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0839TaskDescription copy$default(C0839TaskDescription c0839TaskDescription, long j, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = c0839TaskDescription.copydefault;
                }
                if ((i & 2) != 0) {
                    str = c0839TaskDescription.OLrzqt;
                }
                return c0839TaskDescription.AEQbTJ(j, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0839TaskDescription AEQbTJ(long j, @NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0839TaskDescription(j, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0839TaskDescription)) {
                    return false;
                }
                C0839TaskDescription c0839TaskDescription = (C0839TaskDescription) obj;
                return this.copydefault == c0839TaskDescription.copydefault && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c0839TaskDescription.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (java.lang.Long.hashCode(this.copydefault) * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "WalletNotExists(chainId=" + this.copydefault + ", address=" + this.OLrzqt + ")";
            }

            public C0839TaskDescription(long j, @NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = j;
                this.OLrzqt = str;
            }
        }

        /* JADX INFO: renamed from: o.edc$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements TaskDescription {
            public static final StateListAnimator EZpvd = new StateListAnimator();

            private StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: o.edc$TaskDescription$Activity */
        public static final class Activity implements TaskDescription {
            public final java.lang.Throwable OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = activity.OLrzqt;
                }
                return activity.OLrzqt(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity OLrzqt(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Activity(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.OLrzqt, ((Activity) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(reason=" + this.OLrzqt + ")";
            }

            public Activity(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                this.OLrzqt = th;
            }
        }
    }

    public final Flow<Activity> KWHzl() {
        return FlowKt.receiveAsFlow(this.copydefault);
    }

    public final Flow<TaskDescription> OLrzqt() {
        return FlowKt.receiveAsFlow(this.KWHzl);
    }

    public final void copydefault(@NotNull java.lang.String str, java.lang.Long l, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DefiWalletTrackerAddressViewModel$checkAddress$1(this, str2, str3, str4, str, l, null), 3, null);
    }

    public final Deferred<java.lang.String> EZpvd(CoroutineScope coroutineScope, java.lang.String str) {
        return BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DefiWalletTrackerAddressViewModel$checkENSDomainAsync$1(str, this, null), 3, null);
    }

    public final Deferred<EosAccountResp> OLrzqt(CoroutineScope coroutineScope, java.lang.String str) {
        return BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DefiWalletTrackerAddressViewModel$checkEOSAccountAsync$1(this, str, null), 3, null);
    }

    public final Deferred<java.lang.Boolean> KWHzl(CoroutineScope coroutineScope, java.lang.String str) {
        return BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DefiWalletTrackerAddressViewModel$checkNearAddressAsync$1(this, str, null), 3, null);
    }

    public final void KWHzl(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DefiWalletTrackerAddressViewModel$checkWalletExists$1(this, j, str, null), 3, null);
    }
}
