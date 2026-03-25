package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.trade.features.home.meme.usecase.preset.PresetUserConfigUseCase$getPresetUserConfig$1;
import com.okinc.business.trade.features.home.meme.usecase.preset.PresetUserConfigUseCase$getPresetUserConfiggIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.meme.usecase.preset.PresetUserConfigUseCase$resetPreset$1;
import com.okinc.business.trade.features.home.meme.usecase.preset.PresetUserConfigUseCase$resetPreset0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.meme.usecase.preset.PresetUserConfigUseCase$savePreset$1;
import com.okinc.business.trade.features.home.meme.usecase.preset.PresetUserConfigUseCase$savePreset0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserParams;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28297kWe implements InterfaceC28305kWm {
    public final kVC EZpvd;
    public final kKG KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C28297kWe(@NotNull kVC kvc, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kvc, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = kvc;
        this.KWHzl = kkg;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<DexPresetResultVO>> continuation) throws java.lang.Throwable {
        PresetUserConfigUseCase$getPresetUserConfig$1 presetUserConfigUseCase$getPresetUserConfig$1;
        if (continuation instanceof PresetUserConfigUseCase$getPresetUserConfig$1) {
            presetUserConfigUseCase$getPresetUserConfig$1 = (PresetUserConfigUseCase$getPresetUserConfig$1) continuation;
            int i = presetUserConfigUseCase$getPresetUserConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                presetUserConfigUseCase$getPresetUserConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                presetUserConfigUseCase$getPresetUserConfig$1 = new PresetUserConfigUseCase$getPresetUserConfig$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = presetUserConfigUseCase$getPresetUserConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = presetUserConfigUseCase$getPresetUserConfig$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            PresetUserConfigUseCase$getPresetUserConfiggIAlus$$inlined$dexRunCatching$1 presetUserConfigUseCase$getPresetUserConfiggIAlus$$inlined$dexRunCatching$1 = new PresetUserConfigUseCase$getPresetUserConfiggIAlus$$inlined$dexRunCatching$1(null, this, str);
            presetUserConfigUseCase$getPresetUserConfig$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, presetUserConfigUseCase$getPresetUserConfiggIAlus$$inlined$dexRunCatching$1, presetUserConfigUseCase$getPresetUserConfig$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<DexPresetResultVO>> continuation) throws java.lang.Throwable {
        PresetUserConfigUseCase$resetPreset$1 presetUserConfigUseCase$resetPreset$1;
        if (continuation instanceof PresetUserConfigUseCase$resetPreset$1) {
            presetUserConfigUseCase$resetPreset$1 = (PresetUserConfigUseCase$resetPreset$1) continuation;
            int i = presetUserConfigUseCase$resetPreset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                presetUserConfigUseCase$resetPreset$1.label = i - Integer.MIN_VALUE;
            } else {
                presetUserConfigUseCase$resetPreset$1 = new PresetUserConfigUseCase$resetPreset$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = presetUserConfigUseCase$resetPreset$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = presetUserConfigUseCase$resetPreset$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            PresetUserConfigUseCase$resetPreset0E7RQCE$$inlined$dexRunCatching$1 presetUserConfigUseCase$resetPreset0E7RQCE$$inlined$dexRunCatching$1 = new PresetUserConfigUseCase$resetPreset0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            presetUserConfigUseCase$resetPreset$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, presetUserConfigUseCase$resetPreset0E7RQCE$$inlined$dexRunCatching$1, presetUserConfigUseCase$resetPreset$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull DexPresetResultVO dexPresetResultVO, @NotNull PresetUserParams presetUserParams, @NotNull Continuation<? super Result<? extends java.lang.Object>> continuation) throws java.lang.Throwable {
        PresetUserConfigUseCase$savePreset$1 presetUserConfigUseCase$savePreset$1;
        if (continuation instanceof PresetUserConfigUseCase$savePreset$1) {
            presetUserConfigUseCase$savePreset$1 = (PresetUserConfigUseCase$savePreset$1) continuation;
            int i = presetUserConfigUseCase$savePreset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                presetUserConfigUseCase$savePreset$1.label = i - Integer.MIN_VALUE;
            } else {
                presetUserConfigUseCase$savePreset$1 = new PresetUserConfigUseCase$savePreset$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = presetUserConfigUseCase$savePreset$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = presetUserConfigUseCase$savePreset$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            PresetUserConfigUseCase$savePreset0E7RQCE$$inlined$dexRunCatching$1 presetUserConfigUseCase$savePreset0E7RQCE$$inlined$dexRunCatching$1 = new PresetUserConfigUseCase$savePreset0E7RQCE$$inlined$dexRunCatching$1(null, this, dexPresetResultVO, presetUserParams);
            presetUserConfigUseCase$savePreset$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, presetUserConfigUseCase$savePreset0E7RQCE$$inlined$dexRunCatching$1, presetUserConfigUseCase$savePreset$1);
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

    public DexPresetResultVO AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.OLrzqt(str, this.KWHzl.copydefault(str));
    }

    public void KWHzl() {
        this.EZpvd.copydefault();
    }

    @Override // o.InterfaceC28305kWm
    public PresetUserConfigBean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.EZpvd.AEQbTJ(str, str2, this.KWHzl.copydefault(str));
    }

    public BuySellPreset EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.EZpvd.copydefault(str, str2, i, this.KWHzl.copydefault(str));
    }

    public DexMultiTokenInfoBean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        DexPresetResultVO dexPresetResultVOOLrzqt = this.EZpvd.OLrzqt(str, str2);
        if (dexPresetResultVOOLrzqt == null) {
            return new DexMultiTokenInfoBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null);
        }
        return dexPresetResultVOOLrzqt.getNativeTokenInfo();
    }
}
