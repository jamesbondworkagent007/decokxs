package o;

import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59757zn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC59757zn {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zn.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC59757zn(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC59757zn() {
    }

    /* JADX INFO: renamed from: o.zn$TaskDescription */
    public static final class TaskDescription extends AbstractC59757zn implements java.util.Map<java.lang.String, AbstractC59757zn>, InterfaceC56535yIz {
        public final java.util.Map<java.lang.String, AbstractC59757zn> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zn$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = taskDescription.OLrzqt;
            }
            return taskDescription.EZpvd((java.util.Map<java.lang.String, ? extends AbstractC59757zn>) map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean AEQbTJ(AbstractC59757zn abstractC59757zn) {
            return this.OLrzqt.containsValue(abstractC59757zn);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.Set<Map.Entry<java.lang.String, AbstractC59757zn>> EZpvd() {
            return this.OLrzqt.entrySet();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.util.Map<java.lang.String, ? extends AbstractC59757zn> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return new TaskDescription(map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: remove(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // java.util.Map
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public AbstractC59757zn remove(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.Set<java.lang.String> KWHzl() {
            return this.OLrzqt.keySet();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.OLrzqt.containsKey(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int OLrzqt() {
            return this.OLrzqt.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AbstractC59757zn OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.OLrzqt.get(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map
        public void clear() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.function.BiFunction] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map
        public /* synthetic */ AbstractC59757zn compute(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super AbstractC59757zn, ? extends AbstractC59757zn> biFunction) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.function.Function] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map
        public /* synthetic */ AbstractC59757zn computeIfAbsent(java.lang.String str, java.util.function.Function<? super java.lang.String, ? extends AbstractC59757zn> function) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.function.BiFunction] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map
        public /* synthetic */ AbstractC59757zn computeIfPresent(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super AbstractC59757zn, ? extends AbstractC59757zn> biFunction) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.Collection<AbstractC59757zn> copydefault() {
            return this.OLrzqt.values();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((TaskDescription) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map
        public boolean isEmpty() {
            return this.OLrzqt.isEmpty();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.util.function.BiFunction] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map
        public /* synthetic */ AbstractC59757zn merge(java.lang.String str, AbstractC59757zn abstractC59757zn, java.util.function.BiFunction<? super AbstractC59757zn, ? super AbstractC59757zn, ? extends AbstractC59757zn> biFunction) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map
        public /* synthetic */ AbstractC59757zn put(java.lang.String str, AbstractC59757zn abstractC59757zn) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map
        public void putAll(java.util.Map<? extends java.lang.String, ? extends AbstractC59757zn> map) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map
        public /* synthetic */ AbstractC59757zn putIfAbsent(java.lang.String str, AbstractC59757zn abstractC59757zn) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map
        public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map
        public /* synthetic */ AbstractC59757zn replace(java.lang.String str, AbstractC59757zn abstractC59757zn) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // java.util.Map
        public /* synthetic */ boolean replace(java.lang.String str, AbstractC59757zn abstractC59757zn, AbstractC59757zn abstractC59757zn2) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map
        public void replaceAll(java.util.function.BiFunction<? super java.lang.String, ? super AbstractC59757zn, ? extends AbstractC59757zn> biFunction) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return KWHzl((java.lang.String) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public final boolean containsValue(java.lang.Object obj) {
            if (obj == null || (obj instanceof AbstractC59757zn)) {
                return AEQbTJ((AbstractC59757zn) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public final java.util.Set<Map.Entry<java.lang.String, AbstractC59757zn>> entrySet() {
            return EZpvd();
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map
        public final /* synthetic */ AbstractC59757zn get(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return OLrzqt((java.lang.String) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final java.util.Set<java.lang.String> keySet() {
            return KWHzl();
        }

        @Override // java.util.Map
        public final int size() {
            return OLrzqt();
        }

        @Override // java.util.Map
        public final java.util.Collection<AbstractC59757zn> values() {
            return copydefault();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends o.zn> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull java.util.Map<java.lang.String, ? extends AbstractC59757zn> map) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            this.OLrzqt = map;
        }

        public java.lang.String toString() {
            return CollectionsKt___CollectionsKt.joinToString$default(this.OLrzqt.entrySet(), ",", "{", "}", 0, null, new Function1<Map.Entry<? extends java.lang.String, ? extends AbstractC59757zn>, java.lang.CharSequence>() { // from class: aws.smithy.kotlin.runtime.content.Document$Map$toString$1
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends AbstractC59757zn> entry) {
                    return invoke2((Map.Entry<String, ? extends AbstractC59757zn>) entry);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final CharSequence invoke2(@NotNull Map.Entry<String, ? extends AbstractC59757zn> entry) {
                    Intrinsics.checkNotNullParameter(entry, "");
                    return '\"' + entry.getKey() + "\":" + entry.getValue();
                }
            }, 24, null);
        }
    }
}
