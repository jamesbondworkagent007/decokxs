package aws.smithy.kotlin.runtime.telemetry.logging.slf4j;

import com.google.firebase.messaging.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C5155Gv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Slf4j1xLogRecordBuilderAdapter$emit$logMethod$1 extends FunctionReferenceImpl implements Function2<Throwable, Function0<? extends String>, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Slf4j1xLogRecordBuilderAdapter$emit$logMethod$1(Object obj) {
        super(2, obj, C5155Gv.class, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "error(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th, Function0<? extends String> function0) {
        invoke2(th, (Function0<String>) function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th, @NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        ((C5155Gv) this.receiver).EZpvd(th, function0);
    }
}
