package o;

import com.okinc.business.trade.features.home.meme.repository.core.DefaultDexPresetCoreApi$resetPresetConfig$1;
import com.okinc.business.trade.features.home.meme.repository.core.DefaultDexPresetCoreApi$resetPresetConfig$2$1;
import com.okinc.business.trade.features.home.meme.repository.core.DefaultDexPresetCoreApi$resetPresetConfig$2$2;
import com.okinc.business.trade.features.home.meme.repository.core.DefaultDexPresetCoreApi$resetPresetConfig$2$3;
import com.okinc.business.trade.features.home.meme.repository.core.DefaultDexPresetCoreApi$resetPresetConfig$2$4;
import com.okinc.business.trade.features.home.meme.repository.core.DefaultDexPresetCoreApi$savePresetConfig$1;
import com.okinc.business.trade.features.home.meme.repository.core.DefaultDexPresetCoreApi$savePresetConfig$2$1;
import com.okinc.business.trade.features.home.meme.repository.core.DefaultDexPresetCoreApi$savePresetConfig$2$2;
import com.okinc.business.trade.features.home.meme.repository.core.DefaultDexPresetCoreApi$savePresetConfig$2$3;
import com.okinc.business.trade.features.home.meme.repository.core.DefaultDexPresetCoreApi$savePresetConfig$2$4;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVJ implements kVH {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.kVH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, long j, @NotNull Continuation<? super Result<C2292AGd>> continuation) throws java.lang.Throwable {
        DefaultDexPresetCoreApi$resetPresetConfig$1 defaultDexPresetCoreApi$resetPresetConfig$1;
        if (continuation instanceof DefaultDexPresetCoreApi$resetPresetConfig$1) {
            defaultDexPresetCoreApi$resetPresetConfig$1 = (DefaultDexPresetCoreApi$resetPresetConfig$1) continuation;
            int i = defaultDexPresetCoreApi$resetPresetConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultDexPresetCoreApi$resetPresetConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultDexPresetCoreApi$resetPresetConfig$1 = new DefaultDexPresetCoreApi$resetPresetConfig$1(this, continuation);
            }
        }
        java.lang.Object obj = defaultDexPresetCoreApi$resetPresetConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = defaultDexPresetCoreApi$resetPresetConfig$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        AEH aehResetPresetConfig = AAL.resetPresetConfig(str, j);
        C33077mpe c33077mpe = new C33077mpe(new DefaultDexPresetCoreApi$resetPresetConfig$2$1(aehResetPresetConfig), new DefaultDexPresetCoreApi$resetPresetConfig$2$2(aehResetPresetConfig), new DefaultDexPresetCoreApi$resetPresetConfig$2$3(aehResetPresetConfig), new DefaultDexPresetCoreApi$resetPresetConfig$2$4(aehResetPresetConfig), null, 16, null);
        defaultDexPresetCoreApi$resetPresetConfig$1.label = 1;
        java.lang.Object objAEQbTJ = c33077mpe.AEQbTJ(defaultDexPresetCoreApi$resetPresetConfig$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kVH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull C2297AGi c2297AGi, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        DefaultDexPresetCoreApi$savePresetConfig$1 defaultDexPresetCoreApi$savePresetConfig$1;
        if (continuation instanceof DefaultDexPresetCoreApi$savePresetConfig$1) {
            defaultDexPresetCoreApi$savePresetConfig$1 = (DefaultDexPresetCoreApi$savePresetConfig$1) continuation;
            int i = defaultDexPresetCoreApi$savePresetConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultDexPresetCoreApi$savePresetConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultDexPresetCoreApi$savePresetConfig$1 = new DefaultDexPresetCoreApi$savePresetConfig$1(this, continuation);
            }
        }
        java.lang.Object obj = defaultDexPresetCoreApi$savePresetConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = defaultDexPresetCoreApi$savePresetConfig$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C4449Bem c4449BemSavePresetConfig = AAL.savePresetConfig(c2297AGi);
        C33077mpe c33077mpe = new C33077mpe(new DefaultDexPresetCoreApi$savePresetConfig$2$1(c4449BemSavePresetConfig), new DefaultDexPresetCoreApi$savePresetConfig$2$2(c4449BemSavePresetConfig), new DefaultDexPresetCoreApi$savePresetConfig$2$3(c4449BemSavePresetConfig), new DefaultDexPresetCoreApi$savePresetConfig$2$4(c4449BemSavePresetConfig), null, 16, null);
        defaultDexPresetCoreApi$savePresetConfig$1.label = 1;
        java.lang.Object objAEQbTJ = c33077mpe.AEQbTJ(defaultDexPresetCoreApi$savePresetConfig$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }
}
