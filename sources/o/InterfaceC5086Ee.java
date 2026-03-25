package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5086Ee {

    /* JADX INFO: renamed from: o.Ee$ActionBar */
    public interface ActionBar {

        /* JADX INFO: renamed from: o.Ee$ActionBar$ActionBar, reason: collision with other inner class name */
        public interface InterfaceC0800ActionBar {
        }

        Function1<InterfaceC0800ActionBar, Unit> OLrzqt();
    }

    java.lang.Object AEQbTJ(int i, @NotNull Continuation<? super Unit> continuation);

    ActionBar AEQbTJ();
}
