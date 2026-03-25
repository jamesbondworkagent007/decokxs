package com.squareup.moshi.kotlin.reflect;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi._MoshiKotlinTypesExtensionsKt;
import com.squareup.moshi.internal.Util;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import kotlin.reflect.KTypeProjection;
import o.C56403yEb;
import o.C56406yEe;
import o.C56423yEv;
import o.C56532yIw;
import o.C56548yJl;
import o.InterfaceC56551yJo;
import o.InterfaceC56553yJq;
import o.InterfaceC56554yJr;
import o.InterfaceC56555yJs;
import o.InterfaceC56559yJw;
import o.InterfaceC56560yJx;
import o.yHE;
import o.yJD;
import o.yJG;
import o.yJK;
import o.yJN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class KotlinJsonAdapterFactory implements JsonAdapter.Factory {
    /* JADX DEBUG: Class process forced to load method for inline: com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding.copy$default(com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter$Binding, java.lang.String, com.squareup.moshi.JsonAdapter, o.yJx, kotlin.reflect.KParameter, int, int, java.lang.Object):com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter$Binding */
    /* JADX DEBUG: Type inference failed for r0v33. Raw type applied. Possible types: com.squareup.moshi.JsonAdapter<T>, com.squareup.moshi.JsonAdapter<?> */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b1  */
    @Override // com.squareup.moshi.JsonAdapter.Factory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> set, @NotNull Moshi moshi) {
        Object next;
        String name;
        InterfaceC56553yJq classifier;
        Type typeEZpvd;
        Object next2;
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(moshi, "");
        boolean z = true;
        if (!set.isEmpty()) {
            return null;
        }
        Class<?> rawType = _MoshiKotlinTypesExtensionsKt.getRawType(type);
        if (rawType.isInterface() || rawType.isEnum() || !rawType.isAnnotationPresent(KotlinJsonAdapterKt.KOTLIN_METADATA) || Util.isPlatformType(rawType)) {
            return null;
        }
        try {
            JsonAdapter<?> jsonAdapterGeneratedAdapter = Util.generatedAdapter(moshi, type, rawType);
            if (jsonAdapterGeneratedAdapter != null) {
                return jsonAdapterGeneratedAdapter;
            }
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof ClassNotFoundException)) {
                throw e;
            }
        }
        if (!(!rawType.isLocalClass())) {
            throw new IllegalArgumentException(("Cannot serialize local class or object expression " + rawType.getName()).toString());
        }
        InterfaceC56551yJo interfaceC56551yJoKWHzl = yHE.KWHzl(rawType);
        if (!(!interfaceC56551yJoKWHzl.fetchVPNInfo())) {
            throw new IllegalArgumentException(("Cannot serialize abstract class " + rawType.getName()).toString());
        }
        if (!(!interfaceC56551yJoKWHzl.AkhnZx())) {
            throw new IllegalArgumentException(("Cannot serialize inner class " + rawType.getName()).toString());
        }
        if (interfaceC56551yJoKWHzl.djBIcL() != null) {
            throw new IllegalArgumentException(("Cannot serialize object declaration " + rawType.getName()).toString());
        }
        if (!(!interfaceC56551yJoKWHzl.values())) {
            throw new IllegalArgumentException(("Cannot reflectively serialize sealed class " + rawType.getName() + ". Please register an adapter.").toString());
        }
        InterfaceC56555yJs interfaceC56555yJsOLrzqt = yJK.OLrzqt(interfaceC56551yJoKWHzl);
        if (interfaceC56555yJsOLrzqt == null) {
            return null;
        }
        List<KParameter> parameters = interfaceC56555yJsOLrzqt.getParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(parameters, 10)), 16));
        for (Object obj : parameters) {
            linkedHashMap.put(((KParameter) obj).KWHzl(), obj);
        }
        yJG.OLrzqt(interfaceC56555yJsOLrzqt, true);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (InterfaceC56560yJx interfaceC56560yJx : yJK.AEQbTJ(interfaceC56551yJoKWHzl)) {
            KParameter kParameter = (KParameter) linkedHashMap.get(interfaceC56560yJx.getName());
            yJG.OLrzqt(interfaceC56560yJx, z);
            Iterator<T> it = interfaceC56560yJx.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Annotation) next) instanceof Json) {
                    break;
                }
            }
            Json json = (Json) next;
            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) interfaceC56560yJx.getAnnotations());
            if (kParameter != null) {
                C56406yEe.KWHzl(listFJNWhG, kParameter.getAnnotations());
                if (json == null) {
                    Iterator<T> it2 = kParameter.getAnnotations().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (((Annotation) next2) instanceof Json) {
                            break;
                        }
                    }
                    json = (Json) next2;
                }
            }
            Field fieldKWHzl = yJN.KWHzl(interfaceC56560yJx);
            if (Modifier.isTransient(fieldKWHzl != null ? fieldKWHzl.getModifiers() : 0)) {
                if (kParameter != null && !kParameter.EZpvd()) {
                    throw new IllegalArgumentException(("No default value for transient constructor " + kParameter).toString());
                }
            } else if (json != null && json.ignore() == z) {
                if (kParameter != null && !kParameter.EZpvd()) {
                    throw new IllegalArgumentException(("No default value for ignored constructor " + kParameter).toString());
                }
            } else {
                if (kParameter != null && !Intrinsics.EZpvd(kParameter.copydefault(), interfaceC56560yJx.getReturnType())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('\'');
                    sb.append(interfaceC56560yJx.getName());
                    sb.append("' has a constructor parameter of type ");
                    Intrinsics.copydefault(kParameter);
                    sb.append(kParameter.copydefault());
                    sb.append(" but a property of type ");
                    sb.append(interfaceC56560yJx.getReturnType());
                    sb.append('.');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                if ((interfaceC56560yJx instanceof InterfaceC56554yJr) || kParameter != null) {
                    if (json == null || (name = json.name()) == null) {
                        name = interfaceC56560yJx.getName();
                        String str = name;
                        classifier = interfaceC56560yJx.getReturnType().getClassifier();
                        if (!(classifier instanceof InterfaceC56551yJo)) {
                            InterfaceC56551yJo interfaceC56551yJo = (InterfaceC56551yJo) classifier;
                            if (interfaceC56551yJo.DbNXlk()) {
                                typeEZpvd = yHE.OLrzqt(interfaceC56551yJo);
                                if (!interfaceC56560yJx.getReturnType().getArguments().isEmpty()) {
                                    List<KTypeProjection> arguments = interfaceC56560yJx.getReturnType().getArguments();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<T> it3 = arguments.iterator();
                                    while (it3.hasNext()) {
                                        InterfaceC56559yJw interfaceC56559yJwCopydefault = ((KTypeProjection) it3.next()).copydefault();
                                        Type typeEZpvd2 = interfaceC56559yJwCopydefault != null ? yJN.EZpvd(interfaceC56559yJwCopydefault) : null;
                                        if (typeEZpvd2 != null) {
                                            arrayList.add(typeEZpvd2);
                                        }
                                    }
                                    Type[] typeArr = (Type[]) arrayList.toArray(new Type[0]);
                                    typeEZpvd = Types.newParameterizedType(typeEZpvd, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
                                }
                            } else {
                                typeEZpvd = yJN.EZpvd(interfaceC56560yJx.getReturnType());
                            }
                        } else if (classifier instanceof yJD) {
                            typeEZpvd = yJN.EZpvd(interfaceC56560yJx.getReturnType());
                        } else {
                            throw new IllegalStateException("Not possible!".toString());
                        }
                        JsonAdapter jsonAdapterAdapter = moshi.adapter(Util.resolve(type, rawType, typeEZpvd), Util.jsonAnnotations((Annotation[]) listFJNWhG.toArray(new Annotation[0])), interfaceC56560yJx.getName());
                        String name2 = interfaceC56560yJx.getName();
                        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
                        Intrinsics.copydefault(interfaceC56560yJx, "");
                        linkedHashMap2.put(name2, new KotlinJsonAdapter.Binding(str, jsonAdapterAdapter, interfaceC56560yJx, kParameter, kParameter == null ? kParameter.AEQbTJ() : -1));
                        z = true;
                    } else {
                        if (Intrinsics.EZpvd((Object) name, (Object) Json.UNSET_NAME)) {
                            name = null;
                        }
                        if (name == null) {
                        }
                        String str2 = name;
                        classifier = interfaceC56560yJx.getReturnType().getClassifier();
                        if (!(classifier instanceof InterfaceC56551yJo)) {
                        }
                        JsonAdapter jsonAdapterAdapter2 = moshi.adapter(Util.resolve(type, rawType, typeEZpvd), Util.jsonAnnotations((Annotation[]) listFJNWhG.toArray(new Annotation[0])), interfaceC56560yJx.getName());
                        String name22 = interfaceC56560yJx.getName();
                        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
                        Intrinsics.copydefault(interfaceC56560yJx, "");
                        linkedHashMap2.put(name22, new KotlinJsonAdapter.Binding(str2, jsonAdapterAdapter2, interfaceC56560yJx, kParameter, kParameter == null ? kParameter.AEQbTJ() : -1));
                        z = true;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (KParameter kParameter2 : interfaceC56555yJsOLrzqt.getParameters()) {
            KotlinJsonAdapter.Binding binding = (KotlinJsonAdapter.Binding) C56532yIw.AEQbTJ(linkedHashMap2).remove(kParameter2.KWHzl());
            if (binding == null && !kParameter2.EZpvd()) {
                throw new IllegalArgumentException(("No property for required constructor " + kParameter2).toString());
            }
            arrayList2.add(binding);
        }
        int size = arrayList2.size();
        Iterator it4 = linkedHashMap2.entrySet().iterator();
        while (true) {
            int i = size;
            if (!it4.hasNext()) {
                break;
            }
            size = i + 1;
            arrayList2.add(KotlinJsonAdapter.Binding.copy$default((KotlinJsonAdapter.Binding) ((Map.Entry) it4.next()).getValue(), null, null, null, null, i, 15, null));
        }
        List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(arrayList2);
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listQfsBiF, 10));
        Iterator it5 = listQfsBiF.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((KotlinJsonAdapter.Binding) it5.next()).getJsonName());
        }
        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
        JsonReader.Options optionsOf = JsonReader.Options.of((String[]) Arrays.copyOf(strArr, strArr.length));
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        return new KotlinJsonAdapter(interfaceC56555yJsOLrzqt, arrayList2, listQfsBiF, optionsOf).nullSafe();
    }
}
