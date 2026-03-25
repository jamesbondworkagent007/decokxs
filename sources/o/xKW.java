package o;

import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xKW<Resp> extends xKQ<Resp> {
    public static final Application Companion = new Application(null);
    public static final int fJNWhG = 8;
    public java.util.ArrayList<java.lang.Object> AuCTel;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<Resp>> continuation) {
        return KWHzl((xKW) this, (Continuation) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.util.ArrayList<java.lang.Object> arrayList) {
        this.AuCTel = arrayList;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xKW.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static /* synthetic */ <Resp> java.lang.Object KWHzl(xKW<Resp> xkw, Continuation<? super ResponseData<Resp>> continuation) {
        return new ResponseData(0, null, null, null, null, null, 63, null);
    }

    @Override // o.xKQ, o.xKK
    public void OLrzqt(long j) {
        AYXKKw();
        AEQbTJ(j, true);
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCopydefault = copydefault(new Function0() { // from class: o.xKV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xKW.EZpvd(this.AEQbTJ);
            }
        }, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    public static final Unit EZpvd(xKW xkw) {
        java.util.ArrayList<java.lang.Object> arrayList = xkw.AuCTel;
        if (arrayList != null) {
            pUU.KWHzl("AbsWbTaskUseCaseCoroutine", "subscribe " + CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList).getClass().getName() + "，id : " + CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList).hashCode());
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                interfaceC54581xNrOLrzqt.copydefault(arrayList);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.xKQ, o.InterfaceC54502xKu
    public void AYXKKw() {
        java.util.ArrayList<java.lang.Object> arrayList = this.AuCTel;
        if (arrayList != null) {
            pUU.KWHzl("AbsWbTaskUseCaseCoroutine", "unbind " + CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList).getClass().getName() + "，id : " + CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList).hashCode());
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                interfaceC54581xNrOLrzqt.AEQbTJ(arrayList);
            }
            this.AuCTel = null;
        }
    }
}
