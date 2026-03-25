package o;

import com.amplitude.core.utilities.InMemoryResponseHandler$handleTimeoutResponse$1;
import com.amplitude.core.utilities.InMemoryResponseHandler$handleTooManyRequestsResponse$3;
import com.amplitude.core.utilities.http.HttpStatus;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KU implements InterfaceC5274Lk {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final CoroutineDispatcher AEQbTJ;
    public final C5255Kr EZpvd;
    public final C5244Kg OLrzqt;
    public final CoroutineScope copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5255Kr OLrzqt() {
        return this.EZpvd;
    }

    public KU(@NotNull C5255Kr c5255Kr, @NotNull C5244Kg c5244Kg, @NotNull CoroutineScope coroutineScope, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c5255Kr, "");
        Intrinsics.checkNotNullParameter(c5244Kg, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c5255Kr;
        this.OLrzqt = c5244Kg;
        this.copydefault = coroutineScope;
        this.AEQbTJ = coroutineDispatcher;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.KU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC5274Lk
    public void OLrzqt(@NotNull C5271Lh c5271Lh, @NotNull java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c5271Lh, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt((java.util.List<? extends C5242Ke>) obj, HttpStatus.SUCCESS.getCode(), "Event sent success.");
    }

    @Override // o.InterfaceC5274Lk
    public void copydefault(@NotNull C5267Ld c5267Ld, @NotNull java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c5267Ld, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<? extends C5242Ke> list = (java.util.List) obj;
        if (list.size() == 1 || c5267Ld.AEQbTJ()) {
            OLrzqt(list, HttpStatus.BAD_REQUEST.getCode(), c5267Ld.EZpvd());
            return;
        }
        java.util.Set<java.lang.Integer> setKWHzl = c5267Ld.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj2 : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C5242Ke c5242Ke = (C5242Ke) obj2;
            if (setKWHzl.contains(java.lang.Integer.valueOf(i)) || c5267Ld.KWHzl(c5242Ke)) {
                arrayList.add(c5242Ke);
            } else {
                arrayList2.add(c5242Ke);
            }
            i++;
        }
        OLrzqt(arrayList, HttpStatus.BAD_REQUEST.getCode(), c5267Ld.EZpvd());
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.EZpvd.EZpvd((C5242Ke) it.next());
        }
    }

    @Override // o.InterfaceC5274Lk
    public void AEQbTJ(@NotNull C5273Lj c5273Lj, @NotNull java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c5273Lj, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<? extends C5242Ke> list = (java.util.List) obj;
        if (list.size() == 1) {
            OLrzqt(list, HttpStatus.PAYLOAD_TOO_LARGE.getCode(), c5273Lj.EZpvd());
            return;
        }
        this.EZpvd.KWHzl().incrementAndGet();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.EZpvd.EZpvd((C5242Ke) it.next());
        }
    }

    @Override // o.InterfaceC5274Lk
    public void OLrzqt(@NotNull C5275Ll c5275Ll, @NotNull java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c5275Ll, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj2 : (java.util.List) obj) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C5242Ke c5242Ke = (C5242Ke) obj2;
            if (c5275Ll.copydefault(c5242Ke)) {
                arrayList.add(c5242Ke);
            } else if (c5275Ll.copydefault().contains(java.lang.Integer.valueOf(i))) {
                arrayList3.add(c5242Ke);
            } else {
                arrayList2.add(c5242Ke);
            }
            i++;
        }
        OLrzqt(arrayList, HttpStatus.TOO_MANY_REQUESTS.getCode(), c5275Ll.AEQbTJ());
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.EZpvd.EZpvd((C5242Ke) it.next());
        }
        BuildersKt__Builders_commonKt.launch$default(this.copydefault, this.AEQbTJ, null, new InMemoryResponseHandler$handleTooManyRequestsResponse$3(arrayList3, this, null), 2, null);
    }

    @Override // o.InterfaceC5274Lk
    public void AEQbTJ(@NotNull C5270Lg c5270Lg, @NotNull java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c5270Lg, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(this.copydefault, this.AEQbTJ, null, new InMemoryResponseHandler$handleTimeoutResponse$1((java.util.List) obj, this, null), 2, null);
    }

    @Override // o.InterfaceC5274Lk
    public void AEQbTJ(@NotNull C5269Lf c5269Lf, @NotNull java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c5269Lf, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (C5242Ke c5242Ke : (java.util.List) obj) {
            if (c5242Ke.fetchVPNInfo() >= this.OLrzqt.gEmmrt()) {
                arrayList.add(c5242Ke);
            } else {
                arrayList2.add(c5242Ke);
            }
        }
        OLrzqt(arrayList, HttpStatus.FAILED.getCode(), c5269Lf.OLrzqt());
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.EZpvd.EZpvd((C5242Ke) it.next());
        }
    }

    private final void OLrzqt(java.util.List<? extends C5242Ke> list, int i, java.lang.String str) {
        for (C5242Ke c5242Ke : list) {
            yHO<C5242Ke, java.lang.Integer, java.lang.String, Unit> yhoKWHzl = this.OLrzqt.KWHzl();
            if (yhoKWHzl != null) {
                yhoKWHzl.invoke(c5242Ke, java.lang.Integer.valueOf(i), str);
            }
            yHO<C5242Ke, java.lang.Integer, java.lang.String, Unit> yhoIsConnected = c5242Ke.isConnected();
            if (yhoIsConnected != null) {
                yhoIsConnected.invoke(c5242Ke, java.lang.Integer.valueOf(i), str);
            }
        }
    }
}
