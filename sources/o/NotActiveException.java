package o;

import aws.sdk.kotlin.runtime.config.profile.ConfigSectionType;
import aws.sdk.kotlin.runtime.config.profile.FileType;
import com.google.android.gms.common.Scopes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.GetField;
import o.InterfaceC5148Go;
import o.NotActiveException;
import o.ObjectStreamClass;
import o.PipedInputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class NotActiveException {

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ConfigSectionType.values().length];
            try {
                iArr[ConfigSectionType.PROFILE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ConfigSectionType.SSO_SESSION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ConfigSectionType.SERVICES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ConfigSectionType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    public static final ObjectOutputStream AEQbTJ(@NotNull java.util.Map<ConfigSectionType, ? extends java.util.Map<java.lang.String, ObjectStreamField>> map, @NotNull ObjectOutput objectOutput) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(objectOutput, "");
        return new ObjectOutputStream(map, objectOutput);
    }

    public static final java.util.Map<ConfigSectionType, java.util.Map<java.lang.String, ObjectStreamField>> OLrzqt(@NotNull InterfaceC5148Go interfaceC5148Go, @NotNull FileType fileType, java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC5148Go, "");
        Intrinsics.checkNotNullParameter(fileType, "");
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return C56424yEw.KWHzl();
        }
        return copydefault(KWHzl(KWHzl(fileType, str), interfaceC5148Go));
    }

    public static final java.util.List<kotlin.Pair<PutField, PipedInputStream>> KWHzl(@NotNull FileType fileType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fileType, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.util.List listUzCIH = StringsKt__StringsKt.uzCIH((java.lang.CharSequence) str);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listUzCIH, 10));
        int i = 0;
        for (java.lang.Object obj : listUzCIH) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new PutField(i2, (java.lang.String) obj));
            i = i2;
        }
        java.util.ArrayList<PutField> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            PutField putField = (PutField) obj2;
            if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) putField.EZpvd())) && !ObjectStreamConstants.copydefault(putField)) {
                arrayList2.add(obj2);
            }
        }
        PipedInputStream.TaskDescription taskDescription = null;
        PipedInputStream.StateListAnimator stateListAnimator = null;
        for (PutField putField2 : arrayList2) {
            PipedInputStream pipedInputStream = fileType.tokenOf(putField2, taskDescription, stateListAnimator);
            if (pipedInputStream instanceof PipedInputStream.TaskDescription) {
                taskDescription = (PipedInputStream.TaskDescription) pipedInputStream;
                stateListAnimator = null;
            } else if (pipedInputStream instanceof PipedInputStream.StateListAnimator) {
                stateListAnimator = (PipedInputStream.StateListAnimator) pipedInputStream;
            }
            listOLrzqt.add(C56390yDp.OLrzqt(putField2, pipedInputStream));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Object, o.PipedInputStream] */
    public static final java.util.Map<PipedInputStream.TaskDescription, java.util.Map<java.lang.String, GetField>> KWHzl(@NotNull java.util.List<? extends kotlin.Pair<PutField, ? extends PipedInputStream>> list, @NotNull InterfaceC5148Go interfaceC5148Go) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC5148Go, "");
        java.util.Map mapOLrzqt = C56423yEv.OLrzqt();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        PipedInputStream.StateListAnimator stateListAnimator = null;
        LinkedHashMap linkedHashMap = null;
        for (kotlin.Pair<PutField, ? extends PipedInputStream> pair : list) {
            final PutField putFieldComponent1 = pair.component1();
            final PipedInputStream pipedInputStreamComponent2 = pair.component2();
            if (pipedInputStreamComponent2 instanceof PipedInputStream.TaskDescription) {
                objectRef.element = pipedInputStreamComponent2;
                if (!mapOLrzqt.containsKey(pipedInputStreamComponent2)) {
                    if (pipedInputStreamComponent2.OLrzqt()) {
                        mapOLrzqt.put(pipedInputStreamComponent2, new LinkedHashMap());
                    } else {
                        InterfaceC5148Go.TaskDescription.warn$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.config.profile.AwsConfigParserKt$toSectionMap$lambda$10$$inlined$warnParse$1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return ObjectStreamClass.KWHzl("Ignoring invalid " + NotActiveException.EZpvd((PipedInputStream.TaskDescription) pipedInputStreamComponent2) + " '" + ((PipedInputStream.TaskDescription) pipedInputStreamComponent2).AEQbTJ() + '\'', Integer.valueOf(putFieldComponent1.OLrzqt()));
                            }
                        }, 1, null);
                    }
                }
                stateListAnimator = null;
            } else if (pipedInputStreamComponent2 instanceof PipedInputStream.StateListAnimator) {
                T t = objectRef.element;
                Intrinsics.copydefault(t, "");
                stateListAnimator = (PipedInputStream.StateListAnimator) pipedInputStreamComponent2;
                if (pipedInputStreamComponent2.OLrzqt()) {
                    if (((PipedInputStream.TaskDescription) objectRef.element).OLrzqt()) {
                        java.lang.Object obj = mapOLrzqt.get(objectRef.element);
                        Intrinsics.copydefault(obj);
                        java.util.Map map = (java.util.Map) obj;
                        if (map.containsKey(stateListAnimator.KWHzl())) {
                            InterfaceC5148Go.TaskDescription.warn$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.config.profile.AwsConfigParserKt$toSectionMap$lambda$10$$inlined$warnParse$4
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                                /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: T */
                                /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function0
                                public final String invoke() {
                                    return ObjectStreamClass.KWHzl('\'' + ((PipedInputStream.StateListAnimator) pipedInputStreamComponent2).KWHzl() + "' defined multiple times in " + NotActiveException.EZpvd((PipedInputStream.TaskDescription) objectRef.element) + " '" + ((PipedInputStream.TaskDescription) objectRef.element).AEQbTJ() + '\'', Integer.valueOf(putFieldComponent1.OLrzqt()));
                                }
                            }, 1, null);
                        }
                        if (map.containsKey(stateListAnimator.KWHzl())) {
                            InterfaceC5148Go.TaskDescription.warn$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.config.profile.AwsConfigParserKt$toSectionMap$lambda$10$$inlined$warnParse$5
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function0
                                public final String invoke() {
                                    return ObjectStreamClass.KWHzl("Overwriting previously-defined property '" + ((PipedInputStream.StateListAnimator) pipedInputStreamComponent2).KWHzl() + '\'', Integer.valueOf(putFieldComponent1.OLrzqt()));
                                }
                            }, 1, null);
                        }
                        map.put(stateListAnimator.KWHzl(), new GetField.TaskDescription(stateListAnimator.AEQbTJ()));
                    } else {
                        InterfaceC5148Go.TaskDescription.warn$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.config.profile.AwsConfigParserKt$toSectionMap$lambda$10$$inlined$warnParse$3
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                            /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
                            /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return ObjectStreamClass.KWHzl("Ignoring property under invalid " + NotActiveException.EZpvd((PipedInputStream.TaskDescription) objectRef.element) + " '" + ((PipedInputStream.TaskDescription) objectRef.element).AEQbTJ() + '\'', Integer.valueOf(putFieldComponent1.OLrzqt()));
                            }
                        }, 1, null);
                    }
                } else {
                    InterfaceC5148Go.TaskDescription.warn$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.config.profile.AwsConfigParserKt$toSectionMap$lambda$10$$inlined$warnParse$2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return ObjectStreamClass.KWHzl("Ignoring invalid property '" + ((PipedInputStream.StateListAnimator) pipedInputStreamComponent2).KWHzl() + '\'', Integer.valueOf(putFieldComponent1.OLrzqt()));
                        }
                    }, 1, null);
                }
            } else if (pipedInputStreamComponent2 instanceof PipedInputStream.ActionBar) {
                T t2 = objectRef.element;
                Intrinsics.copydefault(t2, "");
                Intrinsics.copydefault(stateListAnimator, "");
                java.lang.Object obj2 = mapOLrzqt.get(objectRef.element);
                Intrinsics.copydefault(obj2);
                java.util.Map map2 = (java.util.Map) obj2;
                java.lang.Object obj3 = map2.get(stateListAnimator.KWHzl());
                Intrinsics.copydefault(obj3, "");
                java.lang.String strKWHzl = ((GetField.TaskDescription) obj3).KWHzl();
                map2.put(stateListAnimator.KWHzl(), new GetField.TaskDescription(strKWHzl + '\n' + ((PipedInputStream.ActionBar) pipedInputStreamComponent2).copydefault()));
            } else if (pipedInputStreamComponent2 instanceof PipedInputStream.Activity) {
                T t3 = objectRef.element;
                Intrinsics.copydefault(t3, "");
                Intrinsics.copydefault(stateListAnimator, "");
                if (pipedInputStreamComponent2.OLrzqt()) {
                    java.lang.Object obj4 = mapOLrzqt.get(objectRef.element);
                    Intrinsics.copydefault(obj4);
                    java.util.Map map3 = (java.util.Map) obj4;
                    GetField getField = (GetField) map3.get(stateListAnimator.KWHzl());
                    if (getField instanceof GetField.TaskDescription) {
                        if (((GetField.TaskDescription) getField).KWHzl().length() > 0) {
                            InterfaceC5148Go.TaskDescription.warn$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.config.profile.AwsConfigParserKt$toSectionMap$lambda$10$$inlined$warnParse$7
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function0
                                public final String invoke() {
                                    return ObjectStreamClass.KWHzl("Overwriting previously-defined property '" + ((PipedInputStream.Activity) pipedInputStreamComponent2).KWHzl() + '\'', Integer.valueOf(putFieldComponent1.OLrzqt()));
                                }
                            }, 1, null);
                        }
                        linkedHashMap = new LinkedHashMap();
                        map3.put(stateListAnimator.KWHzl(), new GetField.ActionBar(linkedHashMap));
                    }
                    Intrinsics.copydefault(linkedHashMap);
                    PipedInputStream.Activity activity = (PipedInputStream.Activity) pipedInputStreamComponent2;
                    linkedHashMap.put(activity.KWHzl(), activity.AEQbTJ());
                } else {
                    InterfaceC5148Go.TaskDescription.warn$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.config.profile.AwsConfigParserKt$toSectionMap$lambda$10$$inlined$warnParse$6
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return ObjectStreamClass.KWHzl("Ignoring invalid sub-property '" + ((PipedInputStream.Activity) pipedInputStreamComponent2).KWHzl() + '\'', Integer.valueOf(putFieldComponent1.OLrzqt()));
                        }
                    }, 1, null);
                }
            }
        }
        return C56423yEv.AYXKKw(mapOLrzqt);
    }

    public static final java.lang.String EZpvd(PipedInputStream.TaskDescription taskDescription) {
        int i = TaskDescription.KWHzl[taskDescription.copydefault().ordinal()];
        if (i == 1) {
            return Scopes.PROFILE;
        }
        if (i == 2) {
            return "sso-session";
        }
        if (i == 3) {
            return "services";
        }
        if (i == 4) {
            return "unknown section";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final java.util.Map<java.lang.String, ObjectStreamField> OLrzqt(java.util.List<ObjectStreamField> list) {
        java.util.Map<java.lang.String, GetField> mapKWHzl;
        java.util.Map mapOLrzqt = C56423yEv.OLrzqt();
        for (ObjectStreamField objectStreamField : list) {
            ObjectStreamField objectStreamField2 = (ObjectStreamField) mapOLrzqt.get(objectStreamField.OLrzqt());
            if (objectStreamField2 == null || (mapKWHzl = objectStreamField2.copydefault()) == null) {
                mapKWHzl = C56424yEw.KWHzl();
            }
            mapOLrzqt.put(objectStreamField.OLrzqt(), new ObjectStreamField(objectStreamField.OLrzqt(), C56424yEw.OLrzqt(mapKWHzl, objectStreamField.copydefault()), objectStreamField.EZpvd()));
        }
        return C56423yEv.AYXKKw(mapOLrzqt);
    }

    public static final java.util.Map<ConfigSectionType, java.util.Map<java.lang.String, ObjectStreamField>> copydefault(java.util.Map<PipedInputStream.TaskDescription, ? extends java.util.Map<java.lang.String, ? extends GetField>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<PipedInputStream.TaskDescription, ? extends java.util.Map<java.lang.String, ? extends GetField>> entry : map.entrySet()) {
            boolean zKWHzl = entry.getKey().KWHzl();
            if (!zKWHzl) {
                if (!zKWHzl) {
                    java.util.Set<PipedInputStream.TaskDescription> setKeySet = map.keySet();
                    if (!(setKeySet instanceof java.util.Collection) || !setKeySet.isEmpty()) {
                        for (PipedInputStream.TaskDescription taskDescription : setKeySet) {
                            if (!taskDescription.KWHzl() || !Intrinsics.EZpvd((java.lang.Object) taskDescription.AEQbTJ(), (java.lang.Object) entry.getKey().AEQbTJ())) {
                            }
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new ObjectStreamField(((PipedInputStream.TaskDescription) entry2.getKey()).AEQbTJ(), (java.util.Map) entry2.getValue(), ((PipedInputStream.TaskDescription) entry2.getKey()).copydefault()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (ConfigSectionType configSectionType : ConfigSectionType.values()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (((ObjectStreamField) obj).EZpvd() == configSectionType) {
                    arrayList2.add(obj);
                }
            }
            java.util.Map<java.lang.String, ObjectStreamField> mapOLrzqt = OLrzqt(arrayList2);
            if (!mapOLrzqt.isEmpty()) {
                linkedHashMap2.put(configSectionType, mapOLrzqt);
            }
        }
        return linkedHashMap2;
    }
}
