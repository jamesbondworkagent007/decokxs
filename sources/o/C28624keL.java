package o;

import com.okinc.business.market.features.meme.data.model.MemeFilterParam;
import com.okinc.business.market.features.meme.data.model.MemeTokenV2Data;
import com.okinc.business.market.features.meme.data.repo.MemeRepositoryImpl$addToBlacklist$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.meme.data.repo.MemeRepositoryImpl$addToBlacklist$1;
import com.okinc.business.market.features.meme.data.repo.MemeRepositoryImpl$getBlacklisted$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.meme.data.repo.MemeRepositoryImpl$getBlacklisted$1;
import com.okinc.business.market.features.meme.data.repo.MemeRepositoryImpl$getMemeConfig$2;
import com.okinc.business.market.features.meme.data.repo.MemeRepositoryImpl$getMemeRanking$2;
import com.okinc.business.market.features.meme.data.repo.MemeRepositoryImpl$removeFromBlacklist$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.meme.data.repo.MemeRepositoryImpl$removeFromBlacklist$1;
import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import com.okinc.business.market.features.meme.filter.domain.MemeBlacklist;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28624keL implements InterfaceC28693kfb {
    public final InterfaceC23229huL OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C28624keL(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC23229huL;
        this.copydefault = coroutineDispatcher;
    }

    @Override // o.InterfaceC28693kfb
    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<ConfigInfoData, OKServerException>> continuation) {
        return kAB.EZpvd(new MemeRepositoryImpl$getMemeConfig$2(this, null), continuation);
    }

    @Override // o.InterfaceC28693kfb
    public java.lang.Object EZpvd(@NotNull MemeFilterParam memeFilterParam, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<MemeTokenV2Data>, OKServerException>> continuation) {
        return kAB.EZpvd(new MemeRepositoryImpl$getMemeRanking$2(this, memeFilterParam, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28693kfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<MemeBlacklist>> continuation) throws java.lang.Throwable {
        MemeRepositoryImpl$getBlacklisted$1 memeRepositoryImpl$getBlacklisted$1;
        if (continuation instanceof MemeRepositoryImpl$getBlacklisted$1) {
            memeRepositoryImpl$getBlacklisted$1 = (MemeRepositoryImpl$getBlacklisted$1) continuation;
            int i = memeRepositoryImpl$getBlacklisted$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeRepositoryImpl$getBlacklisted$1.label = i - Integer.MIN_VALUE;
            } else {
                memeRepositoryImpl$getBlacklisted$1 = new MemeRepositoryImpl$getBlacklisted$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = memeRepositoryImpl$getBlacklisted$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeRepositoryImpl$getBlacklisted$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            MemeRepositoryImpl$getBlacklisted$$inlined$dexRunCatching$1 memeRepositoryImpl$getBlacklisted$$inlined$dexRunCatching$1 = new MemeRepositoryImpl$getBlacklisted$$inlined$dexRunCatching$1(null);
            memeRepositoryImpl$getBlacklisted$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, memeRepositoryImpl$getBlacklisted$$inlined$dexRunCatching$1, memeRepositoryImpl$getBlacklisted$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
        C56391yDq.AEQbTJ(objM7386unboximpl);
        return objM7386unboximpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28693kfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull MemeBlacklist memeBlacklist, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MemeRepositoryImpl$addToBlacklist$1 memeRepositoryImpl$addToBlacklist$1;
        if (continuation instanceof MemeRepositoryImpl$addToBlacklist$1) {
            memeRepositoryImpl$addToBlacklist$1 = (MemeRepositoryImpl$addToBlacklist$1) continuation;
            int i = memeRepositoryImpl$addToBlacklist$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeRepositoryImpl$addToBlacklist$1.label = i - Integer.MIN_VALUE;
            } else {
                memeRepositoryImpl$addToBlacklist$1 = new MemeRepositoryImpl$addToBlacklist$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = memeRepositoryImpl$addToBlacklist$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeRepositoryImpl$addToBlacklist$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            MemeRepositoryImpl$addToBlacklist$$inlined$dexRunCatching$1 memeRepositoryImpl$addToBlacklist$$inlined$dexRunCatching$1 = new MemeRepositoryImpl$addToBlacklist$$inlined$dexRunCatching$1(null, this, memeBlacklist);
            memeRepositoryImpl$addToBlacklist$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, memeRepositoryImpl$addToBlacklist$$inlined$dexRunCatching$1, memeRepositoryImpl$addToBlacklist$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        ((Result) objWithContext).m7386unboximpl();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28693kfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull MemeBlacklist memeBlacklist, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MemeRepositoryImpl$removeFromBlacklist$1 memeRepositoryImpl$removeFromBlacklist$1;
        if (continuation instanceof MemeRepositoryImpl$removeFromBlacklist$1) {
            memeRepositoryImpl$removeFromBlacklist$1 = (MemeRepositoryImpl$removeFromBlacklist$1) continuation;
            int i = memeRepositoryImpl$removeFromBlacklist$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeRepositoryImpl$removeFromBlacklist$1.label = i - Integer.MIN_VALUE;
            } else {
                memeRepositoryImpl$removeFromBlacklist$1 = new MemeRepositoryImpl$removeFromBlacklist$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = memeRepositoryImpl$removeFromBlacklist$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeRepositoryImpl$removeFromBlacklist$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            MemeRepositoryImpl$removeFromBlacklist$$inlined$dexRunCatching$1 memeRepositoryImpl$removeFromBlacklist$$inlined$dexRunCatching$1 = new MemeRepositoryImpl$removeFromBlacklist$$inlined$dexRunCatching$1(null, this, memeBlacklist);
            memeRepositoryImpl$removeFromBlacklist$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, memeRepositoryImpl$removeFromBlacklist$$inlined$dexRunCatching$1, memeRepositoryImpl$removeFromBlacklist$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        ((Result) objWithContext).m7386unboximpl();
        return Unit.INSTANCE;
    }
}
