package o;

import android.support.v4.media.session.PlaybackStateCompat;
import aws.smithy.kotlin.runtime.content.ByteStreamKt$decodeToString$1;
import aws.smithy.kotlin.runtime.content.ByteStreamKt$toByteArray$1;
import aws.smithy.kotlin.runtime.content.ByteStreamKt$toByteStream$job$1;
import aws.smithy.kotlin.runtime.content.ByteStreamKt$toFlow$1;
import aws.smithy.kotlin.runtime.content.ByteStreamKt$toFlow$2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC59439zh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C59651zl {
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(@NotNull AbstractC59439zh abstractC59439zh, @NotNull Continuation<? super byte[]> continuation) throws java.lang.Throwable {
        ByteStreamKt$toByteArray$1 byteStreamKt$toByteArray$1;
        CS csEZpvd;
        if (continuation instanceof ByteStreamKt$toByteArray$1) {
            byteStreamKt$toByteArray$1 = (ByteStreamKt$toByteArray$1) continuation;
            int i = byteStreamKt$toByteArray$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteStreamKt$toByteArray$1.label = i - Integer.MIN_VALUE;
            } else {
                byteStreamKt$toByteArray$1 = new ByteStreamKt$toByteArray$1(continuation);
            }
        }
        java.lang.Object objKWHzl = byteStreamKt$toByteArray$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = byteStreamKt$toByteArray$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objKWHzl);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            csEZpvd = (CS) byteStreamKt$toByteArray$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            byte[] bArrKWHzl = ((CQ) objKWHzl).KWHzl();
            if (csEZpvd.KWHzl()) {
                throw new java.lang.IllegalStateException("failed to read all bytes from ByteStream, more data still expected".toString());
            }
            return bArrKWHzl;
        }
        C56391yDq.AEQbTJ(objKWHzl);
        if (abstractC59439zh instanceof AbstractC59439zh.Application) {
            return ((AbstractC59439zh.Application) abstractC59439zh).EZpvd();
        }
        if (abstractC59439zh instanceof AbstractC59439zh.Activity) {
            csEZpvd = ((AbstractC59439zh.Activity) abstractC59439zh).EZpvd();
            byteStreamKt$toByteArray$1.L$0 = csEZpvd;
            byteStreamKt$toByteArray$1.label = 1;
            objKWHzl = CV.copydefault(csEZpvd, byteStreamKt$toByteArray$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            byte[] bArrKWHzl2 = ((CQ) objKWHzl).KWHzl();
            if (csEZpvd.KWHzl()) {
            }
        } else {
            if (!(abstractC59439zh instanceof AbstractC59439zh.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC5060De interfaceC5060DeAEQbTJ = ((AbstractC59439zh.StateListAnimator) abstractC59439zh).AEQbTJ();
            byteStreamKt$toByteArray$1.label = 2;
            objKWHzl = C5062Dg.KWHzl(interfaceC5060DeAEQbTJ, byteStreamKt$toByteArray$1);
            return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(@NotNull AbstractC59439zh abstractC59439zh, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        ByteStreamKt$decodeToString$1 byteStreamKt$decodeToString$1;
        if (continuation instanceof ByteStreamKt$decodeToString$1) {
            byteStreamKt$decodeToString$1 = (ByteStreamKt$decodeToString$1) continuation;
            int i = byteStreamKt$decodeToString$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteStreamKt$decodeToString$1.label = i - Integer.MIN_VALUE;
            } else {
                byteStreamKt$decodeToString$1 = new ByteStreamKt$decodeToString$1(continuation);
            }
        }
        java.lang.Object objAEQbTJ = byteStreamKt$decodeToString$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = byteStreamKt$decodeToString$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            byteStreamKt$decodeToString$1.label = 1;
            objAEQbTJ = AEQbTJ(abstractC59439zh, byteStreamKt$decodeToString$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return C59449zhJ.copydefault((byte[]) objAEQbTJ);
    }

    public static /* synthetic */ Flow toFlow$default(AbstractC59439zh abstractC59439zh, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        return KWHzl(abstractC59439zh, j);
    }

    public static final Flow<byte[]> KWHzl(@NotNull AbstractC59439zh abstractC59439zh, long j) {
        Intrinsics.checkNotNullParameter(abstractC59439zh, "");
        if (abstractC59439zh instanceof AbstractC59439zh.Application) {
            return FlowKt.flowOf(((AbstractC59439zh.Application) abstractC59439zh).EZpvd());
        }
        if (abstractC59439zh instanceof AbstractC59439zh.Activity) {
            return KWHzl(((AbstractC59439zh.Activity) abstractC59439zh).EZpvd(), j);
        }
        if (abstractC59439zh instanceof AbstractC59439zh.StateListAnimator) {
            return FlowKt.flowOn(copydefault(((AbstractC59439zh.StateListAnimator) abstractC59439zh).AEQbTJ(), j), C5070Do.OLrzqt.AEQbTJ());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ AbstractC59439zh toByteStream$default(Flow flow, CoroutineScope coroutineScope, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return EZpvd(flow, coroutineScope, l);
    }

    public static final AbstractC59439zh EZpvd(@NotNull Flow<byte[]> flow, @NotNull CoroutineScope coroutineScope, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        final CN cnSdkByteChannel$default = CW.SdkByteChannel$default(true, 0, 2, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ByteStreamKt$toByteStream$job$1(flow, l, new Ref.LongRef(), cnSdkByteChannel$default, null), 3, null).invokeOnCompletion(new Function1<java.lang.Throwable, Unit>() { // from class: aws.smithy.kotlin.runtime.content.ByteStreamKt$toByteStream$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cnSdkByteChannel$default.copydefault(th);
            }
        });
        return new StateListAnimator(l, cnSdkByteChannel$default);
    }

    /* JADX INFO: renamed from: o.zl$StateListAnimator */
    public static final class StateListAnimator extends AbstractC59439zh.Activity {
        public final java.lang.Long EZpvd;
        public final /* synthetic */ CN OLrzqt;
        public final boolean copydefault = true;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh.Activity
        public CS EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh
        public java.lang.Long OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh
        public boolean copydefault() {
            return this.copydefault;
        }

        public StateListAnimator(java.lang.Long l, CN cn2) {
            this.OLrzqt = cn2;
            this.EZpvd = l;
        }
    }

    public static final Flow<byte[]> KWHzl(CS cs, long j) {
        return FlowKt.flow(new ByteStreamKt$toFlow$1(cs, j, null));
    }

    public static final Flow<byte[]> copydefault(InterfaceC5060De interfaceC5060De, long j) {
        return FlowKt.flow(new ByteStreamKt$toFlow$2(interfaceC5060De, j, null));
    }
}
