package com.squareup.moshi.kotlin.reflect;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import o.C56403yEb;
import o.InterfaceC56554yJr;
import o.InterfaceC56555yJs;
import o.InterfaceC56560yJx;
import o.yDL;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class KotlinJsonAdapter<T> extends JsonAdapter<T> {
    private final List<Binding<T, Object>> allBindings;
    private final InterfaceC56555yJs<T> constructor;
    private final List<Binding<T, Object>> nonIgnoredBindings;
    private final JsonReader.Options options;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Binding<T, Object>> getAllBindings() {
        return this.allBindings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56555yJs<T> getConstructor() {
        return this.constructor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Binding<T, Object>> getNonIgnoredBindings() {
        return this.nonIgnoredBindings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonReader.Options getOptions() {
        return this.options;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yJs<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public KotlinJsonAdapter(@NotNull InterfaceC56555yJs<? extends T> interfaceC56555yJs, @NotNull List<Binding<T, Object>> list, @NotNull List<Binding<T, Object>> list2, @NotNull JsonReader.Options options) {
        Intrinsics.checkNotNullParameter(interfaceC56555yJs, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(options, "");
        this.constructor = interfaceC56555yJs;
        this.allBindings = list;
        this.nonIgnoredBindings = list2;
        this.options = options;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(@NotNull JsonReader jsonReader) throws IOException {
        T tCallBy;
        Intrinsics.checkNotNullParameter(jsonReader, "");
        int size = this.constructor.getParameters().size();
        int size2 = this.allBindings.size();
        Object[] objArr = new Object[size2];
        for (int i = 0; i < size2; i++) {
            objArr[i] = KotlinJsonAdapterKt.ABSENT_VALUE;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                Binding<T, Object> binding = this.nonIgnoredBindings.get(iSelectName);
                int propertyIndex = binding.getPropertyIndex();
                if (objArr[propertyIndex] != KotlinJsonAdapterKt.ABSENT_VALUE) {
                    throw new JsonDataException("Multiple values for '" + binding.getProperty().getName() + "' at " + jsonReader.getPath());
                }
                Object objFromJson = binding.getAdapter().fromJson(jsonReader);
                objArr[propertyIndex] = objFromJson;
                if (objFromJson == null && !binding.getProperty().getReturnType().isMarkedNullable()) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull(binding.getProperty().getName(), binding.getJsonName(), jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            }
        }
        jsonReader.endObject();
        boolean z = this.allBindings.size() == size;
        for (int i2 = 0; i2 < size; i2++) {
            if (objArr[i2] == KotlinJsonAdapterKt.ABSENT_VALUE) {
                if (this.constructor.getParameters().get(i2).EZpvd()) {
                    z = false;
                } else {
                    if (!this.constructor.getParameters().get(i2).copydefault().isMarkedNullable()) {
                        String strKWHzl = this.constructor.getParameters().get(i2).KWHzl();
                        Binding<T, Object> binding2 = this.allBindings.get(i2);
                        JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty(strKWHzl, binding2 != null ? binding2.getJsonName() : null, jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                        throw jsonDataExceptionMissingProperty;
                    }
                    objArr[i2] = null;
                }
            }
        }
        if (z) {
            tCallBy = this.constructor.call(Arrays.copyOf(objArr, size2));
        } else {
            tCallBy = this.constructor.callBy(new IndexedParameterMap(this.constructor.getParameters(), objArr));
        }
        int size3 = this.allBindings.size();
        while (size < size3) {
            Binding binding3 = this.allBindings.get(size);
            Intrinsics.copydefault(binding3);
            binding3.set(tCallBy, objArr[size]);
            size++;
        }
        return tCallBy;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, T t) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (t == null) {
            throw new NullPointerException("value == null");
        }
        jsonWriter.beginObject();
        for (Binding<T, Object> binding : this.allBindings) {
            if (binding != null) {
                jsonWriter.name(binding.getJsonName());
                binding.getAdapter().toJson(jsonWriter, binding.get(t));
            }
        }
        jsonWriter.endObject();
    }

    public String toString() {
        return "KotlinJsonAdapter(" + this.constructor.getReturnType() + ')';
    }

    public static final class Binding<K, P> {
        private final JsonAdapter<P> adapter;
        private final String jsonName;
        private final KParameter parameter;
        private final InterfaceC56560yJx<K, P> property;
        private final int propertyIndex;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter$Binding */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Binding copy$default(Binding binding, String str, JsonAdapter jsonAdapter, InterfaceC56560yJx interfaceC56560yJx, KParameter kParameter, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = binding.jsonName;
            }
            if ((i2 & 2) != 0) {
                jsonAdapter = binding.adapter;
            }
            JsonAdapter jsonAdapter2 = jsonAdapter;
            if ((i2 & 4) != 0) {
                interfaceC56560yJx = binding.property;
            }
            InterfaceC56560yJx interfaceC56560yJx2 = interfaceC56560yJx;
            if ((i2 & 8) != 0) {
                kParameter = binding.parameter;
            }
            KParameter kParameter2 = kParameter;
            if ((i2 & 16) != 0) {
                i = binding.propertyIndex;
            }
            return binding.copy(str, jsonAdapter2, interfaceC56560yJx2, kParameter2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.jsonName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonAdapter<P> component2() {
            return this.adapter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56560yJx<K, P> component3() {
            return this.property;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final KParameter component4() {
            return this.parameter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component5() {
            return this.propertyIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Binding<K, P> copy(@NotNull String str, @NotNull JsonAdapter<P> jsonAdapter, @NotNull InterfaceC56560yJx<K, ? extends P> interfaceC56560yJx, KParameter kParameter, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonAdapter, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            return new Binding<>(str, jsonAdapter, interfaceC56560yJx, kParameter, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Binding)) {
                return false;
            }
            Binding binding = (Binding) obj;
            return Intrinsics.EZpvd((Object) this.jsonName, (Object) binding.jsonName) && Intrinsics.EZpvd(this.adapter, binding.adapter) && Intrinsics.EZpvd(this.property, binding.property) && Intrinsics.EZpvd(this.parameter, binding.parameter) && this.propertyIndex == binding.propertyIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonAdapter<P> getAdapter() {
            return this.adapter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getJsonName() {
            return this.jsonName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final KParameter getParameter() {
            return this.parameter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56560yJx<K, P> getProperty() {
            return this.property;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getPropertyIndex() {
            return this.propertyIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.jsonName.hashCode();
            int iHashCode2 = this.adapter.hashCode();
            int iHashCode3 = this.property.hashCode();
            KParameter kParameter = this.parameter;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (kParameter == null ? 0 : kParameter.hashCode())) * 31) + Integer.hashCode(this.propertyIndex);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Binding(jsonName=" + this.jsonName + ", adapter=" + this.adapter + ", property=" + this.property + ", parameter=" + this.parameter + ", propertyIndex=" + this.propertyIndex + ')';
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yJx<K, ? extends P> */
        /* JADX WARN: Multi-variable type inference failed */
        public Binding(@NotNull String str, @NotNull JsonAdapter<P> jsonAdapter, @NotNull InterfaceC56560yJx<K, ? extends P> interfaceC56560yJx, KParameter kParameter, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonAdapter, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            this.jsonName = str;
            this.adapter = jsonAdapter;
            this.property = interfaceC56560yJx;
            this.parameter = kParameter;
            this.propertyIndex = i;
        }

        public final P get(K k) {
            return this.property.get(k);
        }

        public final void set(K k, P p) {
            if (p != KotlinJsonAdapterKt.ABSENT_VALUE) {
                InterfaceC56560yJx<K, P> interfaceC56560yJx = this.property;
                Intrinsics.copydefault(interfaceC56560yJx, "");
                ((InterfaceC56554yJr) interfaceC56560yJx).set(k, p);
            }
        }
    }

    public static final class IndexedParameterMap extends yDL<KParameter, Object> {
        private final List<KParameter> parameterKeys;
        private final Object[] parameterValues;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yDL, java.util.AbstractMap, java.util.Map
        public Object put(@NotNull KParameter kParameter, Object obj) {
            Intrinsics.checkNotNullParameter(kParameter, "");
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof KParameter) {
                return containsKey((KParameter) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof KParameter) {
                return get((KParameter) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof KParameter) ? obj2 : getOrDefault((KParameter) obj, obj2);
        }

        public /* bridge */ Object getOrDefault(KParameter kParameter, Object obj) {
            return super.getOrDefault((Object) kParameter, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof KParameter) {
                return remove((KParameter) obj);
            }
            return null;
        }

        public /* bridge */ Object remove(KParameter kParameter) {
            return super.remove((Object) kParameter);
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj instanceof KParameter) {
                return remove((KParameter) obj, obj2);
            }
            return false;
        }

        public /* bridge */ boolean remove(KParameter kParameter, Object obj) {
            return super.remove((Object) kParameter, obj);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends kotlin.reflect.KParameter> */
        /* JADX WARN: Multi-variable type inference failed */
        public IndexedParameterMap(@NotNull List<? extends KParameter> list, @NotNull Object[] objArr) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(objArr, "");
            this.parameterKeys = list;
            this.parameterValues = objArr;
        }

        public boolean containsKey(@NotNull KParameter kParameter) {
            Intrinsics.checkNotNullParameter(kParameter, "");
            return this.parameterValues[kParameter.AEQbTJ()] != KotlinJsonAdapterKt.ABSENT_VALUE;
        }

        public Object get(@NotNull KParameter kParameter) {
            Intrinsics.checkNotNullParameter(kParameter, "");
            Object obj = this.parameterValues[kParameter.AEQbTJ()];
            if (obj != KotlinJsonAdapterKt.ABSENT_VALUE) {
                return obj;
            }
            return null;
        }

        @Override // o.yDL
        public Set<Map.Entry<KParameter, Object>> getEntries() {
            List<KParameter> list = this.parameterKeys;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            int i = 0;
            for (T t : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                arrayList.add(new AbstractMap.SimpleEntry((KParameter) t, this.parameterValues[i]));
                i++;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t2 : arrayList) {
                if (((AbstractMap.SimpleEntry) t2).getValue() != KotlinJsonAdapterKt.ABSENT_VALUE) {
                    linkedHashSet.add(t2);
                }
            }
            return linkedHashSet;
        }
    }
}
