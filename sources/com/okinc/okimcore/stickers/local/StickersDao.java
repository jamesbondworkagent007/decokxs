package com.okinc.okimcore.stickers.local;

import com.okinc.okimcore.common.database.BaseDao;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C44491sRu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface StickersDao extends BaseDao {

    /* JADX INFO: renamed from: com.okinc.okimcore.stickers.local.StickersDao$getLastPosition$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StateListAnimator.copydefault(null, null, this);
        }
    }

    Object countStickersByPackId(@NotNull String str, @NotNull Continuation<? super Long> continuation);

    Object delete(@NotNull String str, @NotNull Set<String> set, @NotNull Continuation<? super Unit> continuation);

    Object deleteStickersByIds(@NotNull String str, @NotNull Set<String> set, @NotNull Continuation<? super Integer> continuation);

    Object doesStickerExist(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation);

    Object getAllIds(@NotNull Continuation<? super List<C44491sRu>> continuation);

    @Override // com.okinc.okimcore.common.database.BaseDao
    String getDaoName();

    Object getLastNullablePosition(@NotNull String str, @NotNull Continuation<? super Long> continuation);

    Object getLastPosition(@NotNull String str, @NotNull Continuation<? super Long> continuation);

    Object getStickers(@NotNull String str, int i, int i2, @NotNull Continuation<? super List<StickerEntity>> continuation);

    Object insert(@NotNull List<StickerEntity> list, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String KWHzl(@NotNull StickersDao stickersDao) {
            return "StickersDao";
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object copydefault(@NotNull StickersDao stickersDao, @NotNull String str, @NotNull Continuation<? super Long> continuation) throws Throwable {
            AnonymousClass1 anonymousClass1;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i = anonymousClass1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            }
            Object lastNullablePosition = anonymousClass1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = anonymousClass1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(lastNullablePosition);
                anonymousClass1.label = 1;
                lastNullablePosition = stickersDao.getLastNullablePosition(str, anonymousClass1);
                if (lastNullablePosition == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(lastNullablePosition);
            }
            Long l = (Long) lastNullablePosition;
            return C56443yFo.KWHzl(l != null ? l.longValue() : 0L);
        }
    }
}
