package o;

import aws.smithy.kotlin.runtime.collections.views.MutableMultiMapView$entries$1;
import aws.smithy.kotlin.runtime.collections.views.MutableMultiMapView$entries$2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.C56617yM;
import o.C56968yZ;
import o.C58214yx;
import o.C59280ze;
import o.InterfaceC56347yC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C59280ze<KSrc, KDest, VSrc, VDest> implements InterfaceC56347yC<KDest, VDest> {
    public final Function1<java.util.List<VDest>, java.util.List<VSrc>> AEQbTJ;
    public final Function1<java.util.List<VSrc>, java.util.List<VDest>> AhwBna;
    public final Function1<KSrc, KDest> EZpvd;
    public final Function1<VDest, VSrc> KWHzl;
    public final Function1<KDest, KSrc> OLrzqt;
    public final InterfaceC56347yC<KSrc, VSrc> copydefault;
    public final Function1<VSrc, VDest> valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super KSrc, ? extends KDest> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super KDest, ? extends KSrc> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super VSrc, ? extends VDest> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super VDest, ? extends VSrc> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59280ze(@NotNull InterfaceC56347yC<KSrc, VSrc> interfaceC56347yC, @NotNull Function1<? super KSrc, ? extends KDest> function1, @NotNull Function1<? super KDest, ? extends KSrc> function12, @NotNull Function1<? super VSrc, ? extends VDest> function13, @NotNull Function1<? super VDest, ? extends VSrc> function14) {
        Intrinsics.checkNotNullParameter(interfaceC56347yC, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        this.copydefault = interfaceC56347yC;
        this.EZpvd = function1;
        this.OLrzqt = function12;
        this.valueOf = function13;
        this.KWHzl = function14;
        this.AhwBna = new Function1<java.util.List<VSrc>, C56968yZ<VSrc, VDest>>(this) { // from class: aws.smithy.kotlin.runtime.collections.views.MutableMultiMapView$vListSrc2Dest$1
            final /* synthetic */ C59280ze<KSrc, KDest, VSrc, VDest> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final C56968yZ<VSrc, VDest> invoke(@NotNull List<VSrc> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return C56617yM.OLrzqt((List) list, this.this$0.valueOf, this.this$0.KWHzl);
            }
        };
        this.AEQbTJ = new Function1<java.util.List<VDest>, java.util.List<VSrc>>(this) { // from class: aws.smithy.kotlin.runtime.collections.views.MutableMultiMapView$vListDest2Src$1
            final /* synthetic */ C59280ze<KSrc, KDest, VSrc, VDest> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final List<VSrc> invoke(@NotNull List<VDest> list) {
                Intrinsics.checkNotNullParameter(list, "");
                ArrayList arrayList = new ArrayList();
                Function1 function15 = this.this$0.KWHzl;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(function15.invoke(it.next()));
                }
                return arrayList;
            }
        };
    }

    @Override // o.InterfaceC56347yC
    public java.util.List<VDest> OLrzqt(KDest kdest, VDest vdest) {
        return InterfaceC56347yC.TaskDescription.OLrzqt(this, kdest, vdest);
    }

    @Override // o.InterfaceC56347yC
    public InterfaceC58267yy<KDest, VDest> OLrzqt() {
        return InterfaceC56347yC.TaskDescription.EZpvd(this);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (C56532yIw.DbNXlk(obj)) {
            return OLrzqt((java.util.List) obj);
        }
        return false;
    }

    @Override // o.InterfaceC56347yC
    public void copydefault(@NotNull java.util.Map<KDest, ? extends java.util.List<? extends VDest>> map) {
        InterfaceC56347yC.TaskDescription.OLrzqt(this, map);
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<KDest, java.util.List<VDest>>> entrySet() {
        return AEQbTJ();
    }

    @Override // java.util.Map
    public final java.util.Set<KDest> keySet() {
        return EZpvd();
    }

    @Override // java.util.Map
    public final int size() {
        return KWHzl();
    }

    @Override // java.util.Map
    public final java.util.Collection<java.util.List<VDest>> values() {
        return AhwBna();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final java.util.List<VDest> KWHzl(KDest kdest) {
        java.util.List<VDest> list = (java.util.List) get(kdest);
        if (list != null) {
            return list;
        }
        this.copydefault.put(this.OLrzqt.invoke(kdest), (VSrc) new java.util.ArrayList());
        return (java.util.List) C56424yEw.EZpvd((java.util.Map<KDest, ? extends V>) ((java.util.Map<java.lang.Object, ? extends V>) this), kdest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C56941yY<KSrc, KDest, java.util.List<VSrc>, java.util.List<VDest>> KWHzl(Map.Entry<KSrc, java.util.List<VSrc>> entry) {
        return new C56941yY<>(entry, this.EZpvd, this.AhwBna, this.AEQbTJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C56941yY<KDest, KSrc, java.util.List<VDest>, java.util.List<VSrc>> OLrzqt(Map.Entry<KDest, java.util.List<VDest>> entry) {
        return new C56941yY<>(entry, this.OLrzqt, this.AEQbTJ, this.AhwBna);
    }

    @Override // o.InterfaceC56347yC
    public boolean AEQbTJ(KDest kdest, VDest vdest) {
        return KWHzl(kdest).add(vdest);
    }

    @Override // o.InterfaceC56347yC
    public boolean AEQbTJ(KDest kdest, @NotNull java.util.Collection<? extends VDest> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return KWHzl(kdest).addAll(collection);
    }

    @Override // java.util.Map
    public void clear() {
        this.copydefault.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.copydefault.containsKey(this.OLrzqt.invoke(obj));
    }

    public boolean OLrzqt(@NotNull java.util.List<VDest> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.copydefault.containsValue(this.AEQbTJ.invoke(list));
    }

    public java.util.Set<Map.Entry<KDest, java.util.List<VDest>>> AEQbTJ() {
        return C56617yM.copydefault(this.copydefault.entrySet(), new MutableMultiMapView$entries$1(this), new MutableMultiMapView$entries$2(this));
    }

    @Override // o.InterfaceC56347yC
    public Sequence<Map.Entry<KDest, VDest>> copydefault() {
        return C59467zhb.fetchVPNInfo(this.copydefault.copydefault(), new Function1<Map.Entry<? extends KSrc, ? extends VSrc>, C58214yx<KDest, VDest>>(this) { // from class: aws.smithy.kotlin.runtime.collections.views.MutableMultiMapView$entryValues$1
            final /* synthetic */ C59280ze<KSrc, KDest, VSrc, VDest> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final C58214yx<KDest, VDest> invoke(@NotNull Map.Entry<? extends KSrc, ? extends VSrc> entry) {
                Intrinsics.checkNotNullParameter(entry, "");
                return new C58214yx<>(this.this$0.EZpvd.invoke(entry.getKey()), this.this$0.valueOf.invoke(entry.getValue()));
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.util.List<VDest> get(KDest kdest) {
        java.util.List<VSrc> list = (java.util.List) this.copydefault.get(this.OLrzqt.invoke(kdest));
        if (list != null) {
            return this.AhwBna.invoke(list);
        }
        return null;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.copydefault.isEmpty();
    }

    public java.util.Set<KDest> EZpvd() {
        return C56617yM.copydefault(this.copydefault.keySet(), this.EZpvd, this.OLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Map
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.util.List<VDest> put(KDest kdest, @NotNull java.util.List<VDest> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<VSrc> list2 = (java.util.List) this.copydefault.put(this.OLrzqt.invoke(kdest), (VSrc) this.AEQbTJ.invoke(list));
        if (list2 != null) {
            return this.AhwBna.invoke(list2);
        }
        return null;
    }

    @Override // java.util.Map
    public void putAll(@NotNull java.util.Map<? extends KDest, ? extends java.util.List<VDest>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            java.util.List<VDest> list = (java.util.List) entry.getValue();
            this.copydefault.put(this.OLrzqt.invoke((KDest) key), (VSrc) this.AEQbTJ.invoke(list));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: remove(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.util.List<VDest> remove(KDest kdest) {
        java.util.List<VSrc> list = (java.util.List) this.copydefault.remove(this.OLrzqt.invoke(kdest));
        if (list != null) {
            return this.AhwBna.invoke(list);
        }
        return null;
    }

    public int KWHzl() {
        return this.copydefault.size();
    }

    public java.util.Collection<java.util.List<VDest>> AhwBna() {
        return C56617yM.OLrzqt(this.copydefault.values(), this.AhwBna, this.AEQbTJ);
    }
}
