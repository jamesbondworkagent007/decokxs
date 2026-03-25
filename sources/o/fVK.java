package o;

import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import com.okinc.business.defi.wallet.tee.repository.TeeMetadataRepositoryImpl$fetchMetadataFromNetwork$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fVK implements fVN {
    public static final Application Companion = new Application(null);
    public final C13934dbu OLrzqt;

    @yCM
    public fVK(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.OLrzqt = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super TeeMetadata> continuation) throws java.lang.Throwable {
        TeeMetadataRepositoryImpl$fetchMetadataFromNetwork$1 teeMetadataRepositoryImpl$fetchMetadataFromNetwork$1;
        fVK fvk;
        if (continuation instanceof TeeMetadataRepositoryImpl$fetchMetadataFromNetwork$1) {
            teeMetadataRepositoryImpl$fetchMetadataFromNetwork$1 = (TeeMetadataRepositoryImpl$fetchMetadataFromNetwork$1) continuation;
            int i = teeMetadataRepositoryImpl$fetchMetadataFromNetwork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeMetadataRepositoryImpl$fetchMetadataFromNetwork$1.label = i - Integer.MIN_VALUE;
            } else {
                teeMetadataRepositoryImpl$fetchMetadataFromNetwork$1 = new TeeMetadataRepositoryImpl$fetchMetadataFromNetwork$1(this, continuation);
            }
        }
        java.lang.Object objValues = teeMetadataRepositoryImpl$fetchMetadataFromNetwork$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeMetadataRepositoryImpl$fetchMetadataFromNetwork$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValues);
            C13934dbu c13934dbu = this.OLrzqt;
            teeMetadataRepositoryImpl$fetchMetadataFromNetwork$1.L$0 = this;
            teeMetadataRepositoryImpl$fetchMetadataFromNetwork$1.label = 1;
            objValues = c13934dbu.values(teeMetadataRepositoryImpl$fetchMetadataFromNetwork$1);
            if (objValues == objCopydefault) {
                return objCopydefault;
            }
            fvk = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fvk = (fVK) teeMetadataRepositoryImpl$fetchMetadataFromNetwork$1.L$0;
            C56391yDq.AEQbTJ(objValues);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objValues;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            fvk.KWHzl((TeeMetadata) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            C17925fXj.EZpvd.EZpvd();
        }
        return abstractC43419rot.copydefault();
    }

    @Override // o.fVN
    public java.lang.Object EZpvd(@NotNull Continuation<? super TeeMetadata> continuation) {
        return OLrzqt(continuation);
    }

    public final void KWHzl(TeeMetadata teeMetadata) {
        C17925fXj.EZpvd.OLrzqt(teeMetadata);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fVK.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
