package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AssistContent;
import o.ComponentCallbacks2;
import o.IntentSender;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class CursorFactory implements PackageManager {
    public final Function1<java.lang.String, Unit> EZpvd;
    public final PackageManager KWHzl;

    @Override // o.PackageManager
    public ComponentCallbacks2.Application OLrzqt() {
        return this.KWHzl.OLrzqt();
    }

    @Override // o.PackageManager
    public IntentSender<java.lang.Long> AEQbTJ(java.lang.Integer num, @NotNull java.lang.String str, int i, Function1<? super Configuration, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.invoke("EXECUTE\n " + str);
        copydefault(function1);
        return this.KWHzl.AEQbTJ(num, str, i, function1);
    }

    @Override // o.PackageManager
    public <R> IntentSender<R> OLrzqt(java.lang.Integer num, @NotNull java.lang.String str, @NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1, int i, Function1<? super Configuration, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd.invoke("QUERY\n " + str);
        copydefault(function12);
        return this.KWHzl.OLrzqt(num, str, function1, i, function12);
    }

    @Override // o.PackageManager
    public IntentSender<ComponentCallbacks2.Application> AEQbTJ() {
        this.EZpvd.invoke("TRANSACTION BEGIN");
        ComponentCallbacks2.Application applicationCopydefault = this.KWHzl.AEQbTJ().copydefault();
        applicationCopydefault.KWHzl(new Function0<Unit>() { // from class: app.cash.sqldelight.logs.LogSqliteDriver$newTransaction$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.EZpvd.invoke("TRANSACTION COMMIT");
            }
        });
        applicationCopydefault.EZpvd(new Function0<Unit>() { // from class: app.cash.sqldelight.logs.LogSqliteDriver$newTransaction$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.EZpvd.invoke("TRANSACTION ROLLBACK");
            }
        });
        return IntentSender.Activity.EZpvd(IntentSender.Activity.copydefault(applicationCopydefault));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.EZpvd.invoke("CLOSE CONNECTION");
        this.KWHzl.close();
    }

    @Override // o.PackageManager
    public void AEQbTJ(@NotNull java.lang.String[] strArr, @NotNull AssistContent.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.EZpvd.invoke("BEGIN " + taskDescription + " LISTENING TO [" + yDV.joinToString$default(strArr, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (Function1) null, 63, (java.lang.Object) null) + AbstractJsonLexerKt.END_LIST);
        this.KWHzl.AEQbTJ((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length), taskDescription);
    }

    @Override // o.PackageManager
    public void OLrzqt(@NotNull java.lang.String[] strArr, @NotNull AssistContent.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.EZpvd.invoke("END " + taskDescription + " LISTENING TO [" + yDV.joinToString$default(strArr, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (Function1) null, 63, (java.lang.Object) null) + AbstractJsonLexerKt.END_LIST);
        this.KWHzl.OLrzqt((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length), taskDescription);
    }

    @Override // o.PackageManager
    public void EZpvd(@NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        this.EZpvd.invoke("NOTIFYING LISTENERS OF [" + yDV.joinToString$default(strArr, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (Function1) null, 63, (java.lang.Object) null) + AbstractJsonLexerKt.END_LIST);
        this.KWHzl.EZpvd((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: 32, r4v1 */
    public final void copydefault(Function1<? super Configuration, Unit> function1) {
        if (function1 != null) {
            Canvas canvas = new Canvas();
            function1.invoke(canvas);
            java.util.List<java.lang.Object> listAEQbTJ = canvas.AEQbTJ();
            if (!listAEQbTJ.isEmpty()) {
                Function1<java.lang.String, Unit> function12 = this.EZpvd;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(' ');
                sb.append(listAEQbTJ);
                function12.invoke(sb.toString());
            }
        }
    }
}
