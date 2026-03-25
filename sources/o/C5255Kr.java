package o;

import com.amplitude.core.Storage;
import com.amplitude.core.platform.EventPipeline$schedule$1;
import com.amplitude.core.platform.EventPipeline$upload$1;
import com.amplitude.core.platform.EventPipeline$write$1;
import com.amplitude.core.platform.WriteQueueMessageType;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Kr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5255Kr {
    public static final Application Companion = new Application(null);
    public long AEQbTJ;
    public final InterfaceC5274Lk AYXKKw;
    public boolean AhwBna;
    public final kotlinx.coroutines.channels.Channel<java.lang.String> AkhnZx;
    public final JZ EZpvd;
    public boolean KWHzl;
    public int OLrzqt;
    public final AtomicInteger copydefault;
    public boolean djBIcL;
    public final InterfaceC5265Lb gEmmrt;
    public AtomicInteger valueOf;
    public final kotlinx.coroutines.channels.Channel<C5259Kv> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5274Lk AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AtomicInteger KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(long j) {
        this.AEQbTJ = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.djBIcL;
    }

    public C5255Kr(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        this.EZpvd = jz;
        this.copydefault = new AtomicInteger(0);
        InterfaceC5265Lb interfaceC5265LbValueOf = jz.djBIcL().valueOf();
        this.gEmmrt = interfaceC5265LbValueOf == null ? new C5266Lc(jz.djBIcL()) : interfaceC5265LbValueOf;
        this.AEQbTJ = jz.djBIcL().AhwBna();
        this.OLrzqt = jz.djBIcL().AYXKKw();
        this.valueOf = new AtomicInteger(1);
        this.AhwBna = false;
        this.djBIcL = false;
        this.values = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.AkhnZx = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        isConnected();
        this.AYXKKw = valueOf().copydefault(this, jz.djBIcL(), djBIcL(), jz.fARcdN());
    }

    public final Storage valueOf() {
        return this.EZpvd.fIwbmz();
    }

    public final CoroutineScope djBIcL() {
        return this.EZpvd.AYXKKw();
    }

    /* JADX INFO: renamed from: o.Kr$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Kr.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void EZpvd(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        c5242Ke.AEQbTJ(c5242Ke.fetchVPNInfo() + 1);
        this.values.mo5769trySendJP2dKIU(new C5259Kv(WriteQueueMessageType.EVENT, c5242Ke));
    }

    public final void AEQbTJ() {
        this.values.mo5769trySendJP2dKIU(new C5259Kv(WriteQueueMessageType.FLUSH, null));
    }

    public final void AkhnZx() {
        this.AhwBna = true;
        fJNWhG();
        DbNXlk();
    }

    public final void values() {
        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) this.AkhnZx, (CancellationException) null, 1, (java.lang.Object) null);
        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) this.values, (CancellationException) null, 1, (java.lang.Object) null);
        this.AhwBna = false;
    }

    public final Job fJNWhG() {
        return BuildersKt__Builders_commonKt.launch$default(djBIcL(), this.EZpvd.fJNWhG(), null, new EventPipeline$write$1(this, null), 2, null);
    }

    public final Job DbNXlk() {
        return BuildersKt__Builders_commonKt.launch$default(djBIcL(), this.EZpvd.AuCTel(), null, new EventPipeline$upload$1(this, null), 2, null);
    }

    public final int OLrzqt() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.OLrzqt / this.valueOf.get());
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 1;
    }

    public final Job fetchVPNInfo() {
        return BuildersKt__Builders_commonKt.launch$default(djBIcL(), this.EZpvd.fJNWhG(), null, new EventPipeline$schedule$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: o.Kr$TaskDescription */
    public static final class TaskDescription extends java.lang.Thread {
        public TaskDescription() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C5255Kr.this.values();
        }
    }

    public final void isConnected() {
        java.lang.Runtime.getRuntime().addShutdownHook(new TaskDescription());
    }
}
