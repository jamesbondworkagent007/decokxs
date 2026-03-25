package o;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class GetField {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.GetField.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ GetField(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GetField() {
    }

    public static final class TaskDescription extends GetField {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            return taskDescription.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((TaskDescription) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    public static final class ActionBar extends GetField implements java.util.Map<java.lang.String, java.lang.String>, InterfaceC56535yIz {
        public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.GetField$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = actionBar.OLrzqt;
            }
            return actionBar.EZpvd(map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.OLrzqt.get(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.Set<Map.Entry<java.lang.String, java.lang.String>> AEQbTJ() {
            return this.OLrzqt.entrySet();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.Set<java.lang.String> EZpvd() {
            return this.OLrzqt.keySet();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return new ActionBar(map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int KWHzl() {
            return this.OLrzqt.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: remove(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // java.util.Map
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public java.lang.String remove(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.Collection<java.lang.String> OLrzqt() {
            return this.OLrzqt.values();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.OLrzqt.containsValue(str);
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
        public /* synthetic */ java.lang.String compute(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> biFunction) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.function.Function] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map
        public /* synthetic */ java.lang.String computeIfAbsent(java.lang.String str, java.util.function.Function<? super java.lang.String, ? extends java.lang.String> function) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.function.BiFunction] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map
        public /* synthetic */ java.lang.String computeIfPresent(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> biFunction) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.OLrzqt.containsKey(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.OLrzqt, ((ActionBar) obj).OLrzqt);
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
        public /* synthetic */ java.lang.String merge(java.lang.String str, java.lang.String str2, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> biFunction) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map
        public /* synthetic */ java.lang.String put(java.lang.String str, java.lang.String str2) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map
        public void putAll(java.util.Map<? extends java.lang.String, ? extends java.lang.String> map) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map
        public /* synthetic */ java.lang.String putIfAbsent(java.lang.String str, java.lang.String str2) {
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
        public /* synthetic */ java.lang.String replace(java.lang.String str, java.lang.String str2) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // java.util.Map
        public /* synthetic */ boolean replace(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map
        public void replaceAll(java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> biFunction) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final boolean containsKey(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return copydefault((java.lang.String) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public final boolean containsValue(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return OLrzqt((java.lang.String) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public final java.util.Set<Map.Entry<java.lang.String, java.lang.String>> entrySet() {
            return AEQbTJ();
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map
        public final /* synthetic */ java.lang.String get(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return AEQbTJ((java.lang.String) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final java.util.Set<java.lang.String> keySet() {
            return EZpvd();
        }

        @Override // java.util.Map
        public final int size() {
            return KWHzl();
        }

        @Override // java.util.Map
        public final java.util.Collection<java.lang.String> values() {
            return OLrzqt();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            this.OLrzqt = map;
        }

        public java.lang.String toString() {
            return this.OLrzqt.toString();
        }
    }
}
