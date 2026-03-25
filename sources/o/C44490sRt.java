package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.stickers.StickerServiceImpl$canSaveSticker$1;
import com.okinc.okimcore.stickers.local.StickerPackEntity;
import com.okinc.okimcore.stickers.remote.model.StickerConfigResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sRt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44490sRt implements InterfaceC44487sRq {
    public final sRC AEQbTJ;
    public final sRS EZpvd;
    public final sRR KWHzl;
    public final sRO OLrzqt;
    public final sRK copydefault;
    public final sRQ gEmmrt;
    public final sRP valueOf;

    @yCM
    public C44490sRt(@NotNull sRK srk, @NotNull sRC src, @NotNull sRS srs, @NotNull sRQ srq, @NotNull sRO sro, @NotNull sRR srr, @NotNull sRP srp) {
        Intrinsics.checkNotNullParameter(srk, "");
        Intrinsics.checkNotNullParameter(src, "");
        Intrinsics.checkNotNullParameter(srs, "");
        Intrinsics.checkNotNullParameter(srq, "");
        Intrinsics.checkNotNullParameter(sro, "");
        Intrinsics.checkNotNullParameter(srr, "");
        Intrinsics.checkNotNullParameter(srp, "");
        this.copydefault = srk;
        this.AEQbTJ = src;
        this.EZpvd = srs;
        this.gEmmrt = srq;
        this.OLrzqt = sro;
        this.KWHzl = srr;
        this.valueOf = srp;
    }

    @Override // o.InterfaceC44487sRq
    public java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<StickerConfigResponse, OKServerException>> continuation) {
        return this.EZpvd.AEQbTJ(continuation);
    }

    @Override // o.InterfaceC44487sRq
    public java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) {
        return this.gEmmrt.AEQbTJ(continuation);
    }

    @Override // o.InterfaceC44487sRq
    public java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Long> continuation) {
        return this.copydefault.EZpvd(StickerPackEntity.CUSTOM_PACK_ID, continuation);
    }

    @Override // o.InterfaceC44487sRq
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, int i2, @NotNull Continuation<? super java.util.List<? extends InterfaceC44488sRr>> continuation) {
        return this.copydefault.EZpvd(str, i, i2, continuation);
    }

    @Override // o.InterfaceC44487sRq
    public java.lang.Object copydefault(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) {
        return this.OLrzqt.EZpvd(set, continuation);
    }

    @Override // o.InterfaceC44487sRq
    public java.lang.Object EZpvd(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) {
        return this.KWHzl.copydefault(set, continuation);
    }

    @Override // o.InterfaceC44487sRq
    public java.lang.Object copydefault(@NotNull java.io.File file, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) {
        return this.valueOf.KWHzl(file, continuation);
    }

    @Override // o.InterfaceC44487sRq
    public Flow<java.util.List<InterfaceC44494sRx>> EZpvd() {
        return this.AEQbTJ.KWHzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44487sRq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Exception {
        StickerServiceImpl$canSaveSticker$1 stickerServiceImpl$canSaveSticker$1;
        if (continuation instanceof StickerServiceImpl$canSaveSticker$1) {
            stickerServiceImpl$canSaveSticker$1 = (StickerServiceImpl$canSaveSticker$1) continuation;
            int i = stickerServiceImpl$canSaveSticker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stickerServiceImpl$canSaveSticker$1.label = i - Integer.MIN_VALUE;
            } else {
                stickerServiceImpl$canSaveSticker$1 = new StickerServiceImpl$canSaveSticker$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = stickerServiceImpl$canSaveSticker$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = stickerServiceImpl$canSaveSticker$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            sRK srk = this.copydefault;
            stickerServiceImpl$canSaveSticker$1.label = 1;
            objKWHzl = srk.KWHzl(StickerPackEntity.CUSTOM_PACK_ID, str, stickerServiceImpl$canSaveSticker$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return C56443yFo.KWHzl(!((java.lang.Boolean) objKWHzl).booleanValue());
    }
}
