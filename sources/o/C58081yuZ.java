package o;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonQualifier;
import com.squareup.moshi.Moshi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58082yua;
import o.InterfaceC58026ytX;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58081yuZ<T> implements InterfaceC58026ytX<T> {
    public final JsonAdapter<T> AEQbTJ;
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final Moshi KWHzl = new Moshi.Builder().build();
    public static final ByteString EZpvd = ByteString.decodeHex("EFBBBF");

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.squareup.moshi.JsonAdapter) A[MD:(com.squareup.moshi.JsonAdapter<T>):void (m)] call: o.yuZ.<init>(com.squareup.moshi.JsonAdapter):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C58081yuZ(JsonAdapter jsonAdapter, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonAdapter);
    }

    public C58081yuZ(JsonAdapter<T> jsonAdapter) {
        this.AEQbTJ = jsonAdapter;
    }

    @Override // o.InterfaceC58026ytX
    public T AEQbTJ(@NotNull AbstractC58082yua abstractC58082yua) throws java.io.IOException {
        java.lang.String strUtf8;
        Intrinsics.checkNotNullParameter(abstractC58082yua, "");
        if (abstractC58082yua instanceof AbstractC58082yua.TaskDescription) {
            strUtf8 = ((AbstractC58082yua.TaskDescription) abstractC58082yua).KWHzl();
        } else if (abstractC58082yua instanceof AbstractC58082yua.ActionBar) {
            AbstractC58082yua.ActionBar actionBar = (AbstractC58082yua.ActionBar) abstractC58082yua;
            ByteString byteStringOf = ByteString.of(actionBar.KWHzl(), 0, actionBar.KWHzl().length);
            ByteString byteString = EZpvd;
            if (byteStringOf.startsWith(byteString)) {
                strUtf8 = byteStringOf.substring(byteString.size()).utf8();
            } else {
                strUtf8 = byteStringOf.utf8();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        T tFromJson = this.AEQbTJ.fromJson(strUtf8);
        Intrinsics.copydefault(tFromJson);
        return tFromJson;
    }

    @Override // o.InterfaceC58026ytX
    public AbstractC58082yua EZpvd(T t) {
        java.lang.String json = this.AEQbTJ.toJson(t);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return new AbstractC58082yua.TaskDescription(json);
    }

    /* JADX INFO: renamed from: o.yuZ$Activity */
    public static final class Activity implements InterfaceC58026ytX.TaskDescription {
        public final Moshi AEQbTJ;
        public final C1014Activity KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public Activity(@NotNull Moshi moshi, @NotNull C1014Activity c1014Activity) {
            Intrinsics.checkNotNullParameter(moshi, "");
            Intrinsics.checkNotNullParameter(c1014Activity, "");
            this.AEQbTJ = moshi;
            this.KWHzl = c1014Activity;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Activity(Moshi moshi, C1014Activity c1014Activity, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                moshi = C58081yuZ.KWHzl;
                Intrinsics.checkNotNullExpressionValue(moshi, "");
            }
            this(moshi, (i & 2) != 0 ? new C1014Activity(false, false, false, 7, null) : c1014Activity);
        }

        @Override // o.InterfaceC58026ytX.TaskDescription
        public InterfaceC58026ytX<?> EZpvd(@NotNull java.lang.reflect.Type type, @NotNull java.lang.annotation.Annotation[] annotationArr) {
            Intrinsics.checkNotNullParameter(type, "");
            Intrinsics.checkNotNullParameter(annotationArr, "");
            JsonAdapter<T> jsonAdapterAdapter = this.AEQbTJ.adapter(type, KWHzl(annotationArr));
            C1014Activity c1014Activity = this.KWHzl;
            if (c1014Activity.copydefault()) {
                jsonAdapterAdapter = jsonAdapterAdapter.lenient();
            }
            if (c1014Activity.EZpvd()) {
                jsonAdapterAdapter = jsonAdapterAdapter.serializeNulls();
            }
            if (c1014Activity.KWHzl()) {
                jsonAdapterAdapter = jsonAdapterAdapter.failOnUnknown();
            }
            Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
            return new C58081yuZ(jsonAdapterAdapter, null);
        }

        /* JADX INFO: renamed from: o.yuZ$Activity$Activity, reason: collision with other inner class name */
        public static final class C1014Activity {
            public final boolean AEQbTJ;
            public final boolean OLrzqt;
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C1014Activity() {
                this(false, false, false, 7, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C1014Activity copy$default(C1014Activity c1014Activity, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = c1014Activity.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    z2 = c1014Activity.copydefault;
                }
                if ((i & 4) != 0) {
                    z3 = c1014Activity.OLrzqt;
                }
                return c1014Activity.AEQbTJ(z, z2, z3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C1014Activity AEQbTJ(boolean z, boolean z2, boolean z3) {
                return new C1014Activity(z, z2, z3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1014Activity)) {
                    return false;
                }
                C1014Activity c1014Activity = (C1014Activity) obj;
                return this.AEQbTJ == c1014Activity.AEQbTJ && this.copydefault == c1014Activity.copydefault && this.OLrzqt == c1014Activity.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v1, types: [int] */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r2v1, types: [int] */
            /* JADX WARN: Type inference failed for: r2v2 */
            /* JADX WARN: Type inference failed for: r2v3 */
            public int hashCode() {
                boolean z = this.AEQbTJ;
                ?? r0 = z;
                if (z) {
                    r0 = 1;
                }
                boolean z2 = this.copydefault;
                ?? r2 = z2;
                if (z2) {
                    r2 = 1;
                }
                boolean z3 = this.OLrzqt;
                return (((r0 * 31) + r2) * 31) + (z3 ? 1 : z3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Config(lenient=" + this.AEQbTJ + ", serializeNull=" + this.copydefault + ", failOnUnknown=" + this.OLrzqt + ')';
            }

            public C1014Activity(boolean z, boolean z2, boolean z3) {
                this.AEQbTJ = z;
                this.copydefault = z2;
                this.OLrzqt = z3;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(boolean, boolean, boolean):void (m)] (LINE:81) call: o.yuZ.Activity.Activity.<init>(boolean, boolean, boolean):void type: THIS */
            public /* synthetic */ C1014Activity(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
            }
        }

        public final java.util.Set<java.lang.annotation.Annotation> KWHzl(java.lang.annotation.Annotation[] annotationArr) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.annotation.Annotation annotation : annotationArr) {
                if (yHE.OLrzqt(yHE.OLrzqt(annotation)).isAnnotationPresent(JsonQualifier.class)) {
                    arrayList.add(annotation);
                }
            }
            return CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        }
    }

    /* JADX INFO: renamed from: o.yuZ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yuZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
