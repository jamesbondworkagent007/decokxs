package com.amplitude.android.plugins;

import android.content.Intent;
import com.amplitude.android.utilities.ActivityCallbackType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelIterator;
import o.C56391yDq;
import o.C56442yFn;
import o.JH;
import o.JQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidLifecyclePlugin$setup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ JH this$0;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ActivityCallbackType.values().length];
            try {
                iArr[ActivityCallbackType.Created.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityCallbackType.Started.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivityCallbackType.Resumed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivityCallbackType.Paused.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActivityCallbackType.Stopped.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ActivityCallbackType.Destroyed.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLifecyclePlugin$setup$1(JH jh, Continuation<? super AndroidLifecyclePlugin$setup$1> continuation) {
        super(2, continuation);
        this.this$0 = jh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new AndroidLifecyclePlugin$setup$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AndroidLifecyclePlugin$setup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:12:0x0038). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        ChannelIterator<JQ> it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            it = this.this$0.copydefault.OLrzqt().iterator();
            this.L$0 = it;
            this.label = 1;
            obj = it.hasNext(this);
            if (obj == objCopydefault) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ChannelIterator) this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (((Boolean) obj).booleanValue()) {
                JQ next = it.next();
                android.app.Activity activity = next.KWHzl().get();
                if (activity != null) {
                    JH jh = this.this$0;
                    switch (Activity.KWHzl[next.copydefault().ordinal()]) {
                        case 1:
                            Intent intent = activity.getIntent();
                            jh.onActivityCreated(activity, intent != null ? intent.getExtras() : null);
                            break;
                        case 2:
                            jh.onActivityStarted(activity);
                            break;
                        case 3:
                            jh.onActivityResumed(activity);
                            break;
                        case 4:
                            jh.onActivityPaused(activity);
                            break;
                        case 5:
                            jh.onActivityStopped(activity);
                            break;
                        case 6:
                            jh.onActivityDestroyed(activity);
                            break;
                    }
                }
                this.L$0 = it;
                this.label = 1;
                obj = it.hasNext(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                if (((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
