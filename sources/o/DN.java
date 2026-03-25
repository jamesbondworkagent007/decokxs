package o;

import aws.smithy.kotlin.runtime.net.url.QueryParameters$Builder$decodedParameters$1;
import aws.smithy.kotlin.runtime.net.url.QueryParameters$Builder$decodedParameters$2;
import aws.smithy.kotlin.runtime.net.url.QueryParameters$Builder$decodedParameters$4;
import aws.smithy.kotlin.runtime.net.url.QueryParameters$Builder$decodedParameters$params$2;
import aws.smithy.kotlin.runtime.net.url.QueryParameters$Builder$decodedParameters$params$4;
import aws.smithy.kotlin.runtime.net.url.QueryParameters$Builder$encodedParameters$2;
import aws.smithy.kotlin.runtime.net.url.QueryParameters$Builder$encodedParameters$4;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import o.C5166Hg;
import o.C5167Hh;
import o.DM;
import o.DN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DN implements InterfaceC58267yy<C5166Hg, C5166Hg> {
    public static final TaskDescription EZpvd;
    public static final DN KWHzl;
    public final InterfaceC58267yy<C5166Hg, C5166Hg> OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.yy), (r2v0 boolean) A[MD:(o.yy<o.Hg, o.Hg>, boolean):void (m)] call: o.DN.<init>(o.yy, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DN(InterfaceC58267yy interfaceC58267yy, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC58267yy, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58267yy
    public InterfaceC56347yC<C5166Hg, C5166Hg> AEQbTJ() {
        return this.OLrzqt.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Collection<o.Hg>, java.util.Collection<java.util.List<o.Hg>> */
    public java.util.Collection<java.util.List<C5166Hg>> AhwBna() {
        return this.OLrzqt.values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<C5166Hg> EZpvd() {
        return this.OLrzqt.keySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd(@NotNull C5166Hg c5166Hg) {
        Intrinsics.checkNotNullParameter(c5166Hg, "");
        return this.OLrzqt.containsKey(c5166Hg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<C5166Hg> KWHzl(@NotNull C5166Hg c5166Hg) {
        Intrinsics.checkNotNullParameter(c5166Hg, "");
        return (java.util.List) this.OLrzqt.get(c5166Hg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Set<java.util.Map$Entry<o.Hg, o.Hg>>, java.util.Set<java.util.Map$Entry<o.Hg, java.util.List<o.Hg>>> */
    public java.util.Set<Map.Entry<C5166Hg, java.util.List<C5166Hg>>> KWHzl() {
        return this.OLrzqt.entrySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: remove(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.util.List<C5166Hg> remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58267yy
    public Sequence<Map.Entry<C5166Hg, C5166Hg>> OLrzqt() {
        return this.OLrzqt.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault(@NotNull java.util.List<C5166Hg> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.OLrzqt.containsValue(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean isEmpty() {
        return this.OLrzqt.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void putAll(java.util.Map<? extends C5166Hg, ? extends java.util.List<? extends C5166Hg>> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void replaceAll(java.util.function.BiFunction<? super C5166Hg, ? super java.util.List<C5166Hg>, ? extends java.util.List<C5166Hg>> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int valueOf() {
        return this.OLrzqt.size();
    }

    public DN(InterfaceC58267yy<C5166Hg, C5166Hg> interfaceC58267yy, boolean z) {
        this.OLrzqt = interfaceC58267yy;
        this.copydefault = z;
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (obj instanceof C5166Hg) {
            return EZpvd((C5166Hg) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            return copydefault((java.util.List) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<C5166Hg, java.util.List<C5166Hg>>> entrySet() {
        return KWHzl();
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof C5166Hg) {
            return KWHzl((C5166Hg) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final java.util.Set<C5166Hg> keySet() {
        return EZpvd();
    }

    @Override // java.util.Map
    public final int size() {
        return valueOf();
    }

    @Override // java.util.Map
    public final java.util.Collection<java.util.List<C5166Hg>> values() {
        return AhwBna();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final DN AEQbTJ(@NotNull Function1<? super StateListAnimator, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            StateListAnimator stateListAnimator = new StateListAnimator();
            function1.invoke(stateListAnimator);
            return stateListAnimator.EZpvd();
        }

        public final java.lang.String copydefault(Sequence<? extends Map.Entry<C5166Hg, C5166Hg>> sequence, boolean z) {
            return copydefault(sequence, z, new PropertyReference1Impl() { // from class: aws.smithy.kotlin.runtime.net.url.QueryParameters$Companion$asEncoded$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((C5166Hg) obj).AEQbTJ();
                }
            });
        }

        public final java.lang.String copydefault(Sequence<? extends Map.Entry<C5166Hg, C5166Hg>> sequence, boolean z, final Function1<? super C5166Hg, java.lang.String> function1) {
            return C59467zhb.joinToString$default(sequence, ContainerUtils.FIELD_DELIMITER, (z || C59467zhb.iwGUEr(sequence)) ? "?" : "", null, 0, null, new Function1<Map.Entry<? extends C5166Hg, ? extends C5166Hg>, java.lang.CharSequence>() { // from class: aws.smithy.kotlin.runtime.net.url.QueryParameters$Companion$asString$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.Hg, java.lang.String> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends C5166Hg, ? extends C5166Hg> entry) {
                    return invoke2((Map.Entry<C5166Hg, C5166Hg>) entry);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final CharSequence invoke2(@NotNull Map.Entry<C5166Hg, C5166Hg> entry) {
                    Intrinsics.checkNotNullParameter(entry, "");
                    return function1.invoke(entry.getKey()) + '=' + function1.invoke(entry.getValue());
                }
            }, 28, null);
        }
    }

    static {
        TaskDescription taskDescription = new TaskDescription(null);
        EZpvd = taskDescription;
        KWHzl = taskDescription.AEQbTJ(new Function1<StateListAnimator, Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.QueryParameters$Companion$Empty$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DN.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DN.StateListAnimator stateListAnimator) {
                invoke2(stateListAnimator);
                return Unit.INSTANCE;
            }
        });
    }

    public final StateListAnimator gEmmrt() {
        return new StateListAnimator(this.OLrzqt.AEQbTJ(), this.copydefault);
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DN.class != obj.getClass()) {
            return false;
        }
        DN dn = (DN) obj;
        return Intrinsics.EZpvd(this.OLrzqt, dn.OLrzqt) && this.copydefault == dn.copydefault;
    }

    @Override // java.util.Map
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    public java.lang.String toString() {
        return EZpvd.copydefault(this.OLrzqt.OLrzqt(), this.copydefault);
    }

    public static final class StateListAnimator implements InterfaceC56347yC<C5166Hg, C5166Hg> {
        public final InterfaceC56347yC<java.lang.String, java.lang.String> AEQbTJ;
        public final InterfaceC56347yC<java.lang.String, java.lang.String> KWHzl;
        public boolean OLrzqt;
        public final InterfaceC56347yC<C5166Hg, C5166Hg> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<C5166Hg> AEQbTJ(@NotNull C5166Hg c5166Hg) {
            Intrinsics.checkNotNullParameter(c5166Hg, "");
            return (java.util.List) this.copydefault.get(c5166Hg);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56347yC<java.lang.String, java.lang.String> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean AEQbTJ(@NotNull java.util.List<C5166Hg> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return this.copydefault.containsValue(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int AYXKKw() {
            return this.copydefault.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Collection<o.Hg>, java.util.Collection<java.util.List<o.Hg>> */
        public java.util.Collection<java.util.List<C5166Hg>> AhwBna() {
            return this.copydefault.values();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // o.InterfaceC56347yC
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean AEQbTJ(@NotNull C5166Hg c5166Hg, @NotNull C5166Hg c5166Hg2) {
            Intrinsics.checkNotNullParameter(c5166Hg, "");
            Intrinsics.checkNotNullParameter(c5166Hg2, "");
            return this.copydefault.AEQbTJ(c5166Hg, c5166Hg2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<C5166Hg> KWHzl(@NotNull C5166Hg c5166Hg) {
            Intrinsics.checkNotNullParameter(c5166Hg, "");
            return (java.util.List) this.copydefault.remove(c5166Hg);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56347yC
        public InterfaceC58267yy<C5166Hg, C5166Hg> OLrzqt() {
            return this.copydefault.OLrzqt();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map
        public void clear() {
            this.copydefault.clear();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // java.util.Map
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public java.util.List<C5166Hg> put(@NotNull C5166Hg c5166Hg, @NotNull java.util.List<C5166Hg> list) {
            Intrinsics.checkNotNullParameter(c5166Hg, "");
            Intrinsics.checkNotNullParameter(list, "");
            return (java.util.List) this.copydefault.put(c5166Hg, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List; */
        @Override // o.InterfaceC56347yC
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public java.util.List<C5166Hg> OLrzqt(@NotNull C5166Hg c5166Hg, @NotNull C5166Hg c5166Hg2) {
            Intrinsics.checkNotNullParameter(c5166Hg, "");
            Intrinsics.checkNotNullParameter(c5166Hg2, "");
            return this.copydefault.OLrzqt(c5166Hg, c5166Hg2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56347yC
        public Sequence<Map.Entry<C5166Hg, C5166Hg>> copydefault() {
            return this.copydefault.copydefault();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map<o.Hg, ? extends java.util.List<o.Hg>>] */
        @Override // o.InterfaceC56347yC
        public void copydefault(@NotNull java.util.Map<C5166Hg, ? extends java.util.List<? extends C5166Hg>> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.copydefault.copydefault(map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean copydefault(@NotNull C5166Hg c5166Hg) {
            Intrinsics.checkNotNullParameter(c5166Hg, "");
            return this.copydefault.containsKey(c5166Hg);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean copydefault(@NotNull C5166Hg c5166Hg, @NotNull java.util.Collection<C5166Hg> collection) {
            Intrinsics.checkNotNullParameter(c5166Hg, "");
            Intrinsics.checkNotNullParameter(collection, "");
            return this.copydefault.AEQbTJ(c5166Hg, collection);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Set<java.util.Map$Entry<o.Hg, o.Hg>>, java.util.Set<java.util.Map$Entry<o.Hg, java.util.List<o.Hg>>> */
        public java.util.Set<Map.Entry<C5166Hg, java.util.List<C5166Hg>>> djBIcL() {
            return this.copydefault.entrySet();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.Set<C5166Hg> gEmmrt() {
            return this.copydefault.keySet();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map
        public boolean isEmpty() {
            return this.copydefault.isEmpty();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map
        public void putAll(@NotNull java.util.Map<? extends C5166Hg, ? extends java.util.List<C5166Hg>> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.copydefault.putAll(map);
        }

        public StateListAnimator(@NotNull InterfaceC56347yC<C5166Hg, C5166Hg> interfaceC56347yC, boolean z) {
            Intrinsics.checkNotNullParameter(interfaceC56347yC, "");
            this.copydefault = interfaceC56347yC;
            this.OLrzqt = z;
            QueryParameters$Builder$decodedParameters$1 queryParameters$Builder$decodedParameters$1 = new PropertyReference1Impl() { // from class: aws.smithy.kotlin.runtime.net.url.QueryParameters$Builder$decodedParameters$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((C5166Hg) obj).OLrzqt();
                }
            };
            C5167Hh.ActionBar actionBar = C5167Hh.KWHzl;
            this.AEQbTJ = C56617yM.OLrzqt(this, queryParameters$Builder$decodedParameters$1, new QueryParameters$Builder$decodedParameters$2(actionBar.EZpvd()), new PropertyReference1Impl() { // from class: aws.smithy.kotlin.runtime.net.url.QueryParameters$Builder$decodedParameters$3
                @Override // kotlin.jvm.internal.PropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((C5166Hg) obj).OLrzqt();
                }
            }, new QueryParameters$Builder$decodedParameters$4(actionBar.EZpvd()));
            this.KWHzl = C56617yM.OLrzqt(this, new PropertyReference1Impl() { // from class: aws.smithy.kotlin.runtime.net.url.QueryParameters$Builder$encodedParameters$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((C5166Hg) obj).AEQbTJ();
                }
            }, new QueryParameters$Builder$encodedParameters$2(actionBar.EZpvd()), new PropertyReference1Impl() { // from class: aws.smithy.kotlin.runtime.net.url.QueryParameters$Builder$encodedParameters$3
                @Override // kotlin.jvm.internal.PropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((C5166Hg) obj).AEQbTJ();
                }
            }, new QueryParameters$Builder$encodedParameters$4(actionBar.EZpvd()));
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.yC)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(o.yC<o.Hg, o.Hg>, boolean):void (m)] (LINE:124) call: o.DN.StateListAnimator.<init>(o.yC, boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(InterfaceC56347yC interfaceC56347yC, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC56347yC, (i & 2) != 0 ? false : z);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Collection] */
        @Override // o.InterfaceC56347yC
        public /* synthetic */ boolean AEQbTJ(C5166Hg c5166Hg, java.util.Collection<? extends C5166Hg> collection) {
            return copydefault(c5166Hg, (java.util.Collection<C5166Hg>) collection);
        }

        @Override // java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            if (obj instanceof C5166Hg) {
                return copydefault((C5166Hg) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public final boolean containsValue(java.lang.Object obj) {
            if (C56532yIw.DbNXlk(obj)) {
                return AEQbTJ((java.util.List<C5166Hg>) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public final java.util.Set<Map.Entry<C5166Hg, java.util.List<C5166Hg>>> entrySet() {
            return djBIcL();
        }

        @Override // java.util.Map
        public final /* synthetic */ java.lang.Object get(java.lang.Object obj) {
            if (obj instanceof C5166Hg) {
                return AEQbTJ((C5166Hg) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final java.util.Set<C5166Hg> keySet() {
            return gEmmrt();
        }

        @Override // java.util.Map
        public final /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
            if (obj instanceof C5166Hg) {
                return KWHzl((C5166Hg) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final int size() {
            return AYXKKw();
        }

        @Override // java.util.Map
        public final java.util.Collection<java.util.List<C5166Hg>> values() {
            return AhwBna();
        }

        public StateListAnimator() {
            this(C56320yB.EZpvd(new kotlin.Pair[0]), false, 2, null);
        }

        public final java.lang.String KWHzl() {
            return DN.EZpvd.copydefault(this.copydefault.copydefault(), this.OLrzqt);
        }

        public final void KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            AEQbTJ(str);
        }

        public final void EZpvd(@NotNull java.lang.String str, @NotNull DM dm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dm, "");
            if (dm.copydefault(DM.TaskDescription.EZpvd)) {
                AEQbTJ(str);
            } else {
                OLrzqt(str);
            }
        }

        public final void OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            KWHzl(this.AEQbTJ, str);
        }

        public final void AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            KWHzl(this.KWHzl, str);
        }

        public final void KWHzl(InterfaceC56347yC<java.lang.String, java.lang.String> interfaceC56347yC, java.lang.String str) {
            java.lang.String str2;
            clear();
            this.OLrzqt = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "?");
            java.lang.String strKWHzl = StringsKt__StringsKt.KWHzl(str, (java.lang.CharSequence) "?");
            if (strKWHzl.length() > 0) {
                java.util.List<java.lang.String> listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strKWHzl, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null);
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
                for (java.lang.String str3 : listSplit$default) {
                    java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) str3, new java.lang.String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, (java.lang.Object) null);
                    java.lang.String str4 = (java.lang.String) listSplit$default2.get(0);
                    int size = listSplit$default2.size();
                    if (size == 1) {
                        str2 = "";
                    } else {
                        if (size != 2) {
                            throw new java.lang.IllegalArgumentException("invalid query string segment " + str3);
                        }
                        str2 = (java.lang.String) listSplit$default2.get(1);
                    }
                    arrayList.add(C56390yDp.OLrzqt(str4, str2));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (kotlin.Pair pair : arrayList) {
                    java.lang.String str5 = (java.lang.String) pair.getFirst();
                    java.lang.Object arrayList2 = linkedHashMap.get(str5);
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                        linkedHashMap.put(str5, arrayList2);
                    }
                    ((java.util.List) arrayList2).add((java.lang.String) pair.getSecond());
                }
                interfaceC56347yC.copydefault(linkedHashMap);
            }
        }

        public final void copydefault(@NotNull InterfaceC5164He interfaceC5164He, @NotNull Function1<? super InterfaceC56347yC<java.lang.String, java.lang.String>, Unit> function1) {
            Intrinsics.checkNotNullParameter(interfaceC5164He, "");
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(Intrinsics.EZpvd(interfaceC5164He, C5167Hh.KWHzl.EZpvd()) ? this.AEQbTJ : C56617yM.OLrzqt(this, new PropertyReference1Impl() { // from class: aws.smithy.kotlin.runtime.net.url.QueryParameters$Builder$decodedParameters$params$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((C5166Hg) obj).OLrzqt();
                }
            }, new QueryParameters$Builder$decodedParameters$params$2(interfaceC5164He), new PropertyReference1Impl() { // from class: aws.smithy.kotlin.runtime.net.url.QueryParameters$Builder$decodedParameters$params$3
                @Override // kotlin.jvm.internal.PropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((C5166Hg) obj).OLrzqt();
                }
            }, new QueryParameters$Builder$decodedParameters$params$4(interfaceC5164He)));
        }

        public final DN EZpvd() {
            return new DN(this.copydefault.OLrzqt(), this.OLrzqt, null);
        }

        public final void copydefault(@NotNull DN dn) {
            Intrinsics.checkNotNullParameter(dn, "");
            clear();
            for (Map.Entry entry : dn.entrySet()) {
                put(entry.getKey(), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) entry.getValue()));
            }
            this.OLrzqt = dn.copydefault();
        }

        public final void EZpvd(@NotNull StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            clear();
            for (Map.Entry entry : stateListAnimator.entrySet()) {
                put(entry.getKey(), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) entry.getValue()));
            }
            this.OLrzqt = stateListAnimator.OLrzqt;
        }
    }
}
