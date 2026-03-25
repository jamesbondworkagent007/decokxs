package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.trade.features.home.meme.usecase.chainlist.MemeChainListUseCase$fetchCoreMemeChainList$2;
import com.okinc.business.trade.features.home.meme.usecase.chainlist.MemeChainListUseCase$requestMemeChainList$1;
import com.okinc.business.trade.features.home.meme.usecase.chainlist.MemeChainListUseCase$requestMemeChainListIoAF18A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVV {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC25414iwK EZpvd;
    public final InterfaceC28276kVk KWHzl;
    public final C2149AAq OLrzqt;

    @yCM
    public kVV(@NotNull InterfaceC28276kVk interfaceC28276kVk, @NotNull C2149AAq c2149AAq, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28276kVk, "");
        Intrinsics.checkNotNullParameter(c2149AAq, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC28276kVk;
        this.OLrzqt = c2149AAq;
        this.EZpvd = interfaceC25414iwK;
        this.AEQbTJ = coroutineDispatcher;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kVV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final java.util.List<DefiChainInfo> EZpvd() {
        return this.KWHzl.OLrzqt();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Result<? extends java.util.List<DefiChainInfo>>> continuation) {
        MemeChainListUseCase$requestMemeChainList$1 memeChainListUseCase$requestMemeChainList$1;
        if (continuation instanceof MemeChainListUseCase$requestMemeChainList$1) {
            memeChainListUseCase$requestMemeChainList$1 = (MemeChainListUseCase$requestMemeChainList$1) continuation;
            int i = memeChainListUseCase$requestMemeChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeChainListUseCase$requestMemeChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                memeChainListUseCase$requestMemeChainList$1 = new MemeChainListUseCase$requestMemeChainList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = memeChainListUseCase$requestMemeChainList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeChainListUseCase$requestMemeChainList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            MemeChainListUseCase$requestMemeChainListIoAF18A$$inlined$dexRunCatching$1 memeChainListUseCase$requestMemeChainListIoAF18A$$inlined$dexRunCatching$1 = new MemeChainListUseCase$requestMemeChainListIoAF18A$$inlined$dexRunCatching$1(null, this);
            memeChainListUseCase$requestMemeChainList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, memeChainListUseCase$requestMemeChainListIoAF18A$$inlined$dexRunCatching$1, memeChainListUseCase$requestMemeChainList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.lang.Object EZpvd(Continuation<? super java.util.List<DefiChainInfo>> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new MemeChainListUseCase$fetchCoreMemeChainList$2(this, null), continuation);
    }

    public final DefiChainInfo AEQbTJ(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) str)) {
                break;
            }
        }
        return (DefiChainInfo) next;
    }
}
