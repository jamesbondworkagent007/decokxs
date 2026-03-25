package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59310zed {
    public static final Application KWHzl = new Application(null);
    public final C59310zed AEQbTJ;
    public final java.util.Map<InterfaceC56691yOt, InterfaceC59317zek> EZpvd;
    public final java.util.List<InterfaceC59317zek> OLrzqt;
    public final InterfaceC56690yOs copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.zed), (r2v0 o.yOs), (r3v0 java.util.List), (r4v0 java.util.Map) A[MD:(o.zed, o.yOs, java.util.List<? extends o.zek>, java.util.Map<o.yOt, ? extends o.zek>):void (m)] call: o.zed.<init>(o.zed, o.yOs, java.util.List, java.util.Map):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C59310zed(C59310zed c59310zed, InterfaceC56690yOs interfaceC56690yOs, java.util.List list, java.util.Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(c59310zed, interfaceC56690yOs, list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56690yOs EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC59317zek> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.zek> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<o.yOt, ? extends o.zek> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59310zed(C59310zed c59310zed, InterfaceC56690yOs interfaceC56690yOs, java.util.List<? extends InterfaceC59317zek> list, java.util.Map<InterfaceC56691yOt, ? extends InterfaceC59317zek> map) {
        this.AEQbTJ = c59310zed;
        this.copydefault = interfaceC56690yOs;
        this.OLrzqt = list;
        this.EZpvd = map;
    }

    public final InterfaceC59317zek AEQbTJ(@NotNull InterfaceC59315zei interfaceC59315zei) {
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = interfaceC59315zei.OLrzqt();
        if (interfaceC56663yNsOLrzqt instanceof InterfaceC56691yOt) {
            return this.EZpvd.get(interfaceC56663yNsOLrzqt);
        }
        return null;
    }

    public final boolean OLrzqt(@NotNull InterfaceC56690yOs interfaceC56690yOs) {
        C59310zed c59310zed;
        Intrinsics.checkNotNullParameter(interfaceC56690yOs, "");
        return Intrinsics.EZpvd(this.copydefault, interfaceC56690yOs) || ((c59310zed = this.AEQbTJ) != null && c59310zed.OLrzqt(interfaceC56690yOs));
    }

    /* JADX INFO: renamed from: o.zed$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zed.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C59310zed EZpvd(C59310zed c59310zed, @NotNull InterfaceC56690yOs interfaceC56690yOs, @NotNull java.util.List<? extends InterfaceC59317zek> list) {
            Intrinsics.checkNotNullParameter(interfaceC56690yOs, "");
            Intrinsics.checkNotNullParameter(list, "");
            java.util.List<InterfaceC56691yOt> listCopydefault = interfaceC56690yOs.fJNWhG().copydefault();
            Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC56691yOt) it.next()).bS_());
            }
            return new C59310zed(c59310zed, interfaceC56690yOs, list, C56424yEw.copydefault(CollectionsKt___CollectionsKt.values(arrayList, list)), null);
        }
    }
}
