package com.amplitude.experiment.evaluation;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.InterfaceC5293Md;
import o.yIG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class EvaluationContext implements Map<String, Object>, InterfaceC5293Md, yIG {
    public static final Companion Companion = new Companion(null);
    public final /* synthetic */ LinkedHashMap<String, Object> $$delegate_0 = new LinkedHashMap<>();

    public static final /* synthetic */ void copydefault(EvaluationContext evaluationContext, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.$$delegate_0.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<String> EZpvd() {
        Set<String> setKeySet = this.$$delegate_0.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        return setKeySet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.$$delegate_0.containsKey(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.$$delegate_0.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Collection<Object> KWHzl() {
        Collection<Object> collectionValues = this.$$delegate_0.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        return collectionValues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.$$delegate_0.remove(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Object put(@NotNull String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.$$delegate_0.put(str, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<Map.Entry<String, Object>> OLrzqt() {
        Set<Map.Entry<String, Object>> setEntrySet = this.$$delegate_0.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        return setEntrySet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void clear() {
        this.$$delegate_0.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.$$delegate_0.containsValue(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean isEmpty() {
        return this.$$delegate_0.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.$$delegate_0.putAll(map);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplitude.experiment.evaluation.EvaluationContext.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EvaluationContext> serializer() {
            return EvaluationContext$$serializer.INSTANCE;
        }
    }

    public EvaluationContext() {
    }

    public /* synthetic */ EvaluationContext(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return EZpvd((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        return OLrzqt();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof String) {
            return KWHzl((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return EZpvd();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj instanceof String) {
            return OLrzqt((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return AEQbTJ();
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        return KWHzl();
    }

    @Override // o.InterfaceC5293Md
    public Object AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return get(str);
    }
}
