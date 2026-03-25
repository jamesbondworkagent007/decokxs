package o;

import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59080zaL {
    public final yNP AEQbTJ;
    public final yNO copydefault;

    /* JADX INFO: renamed from: o.zaL$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            KWHzl = iArr;
        }
    }

    public C59080zaL(@NotNull yNP ynp, @NotNull yNO yno) {
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(yno, "");
        this.AEQbTJ = ynp;
        this.copydefault = yno;
    }

    public final AbstractC56640yMw AEQbTJ() {
        return this.AEQbTJ.AEQbTJ();
    }

    public final yOJ copydefault(@NotNull ProtoBuf.Annotation annotation, @NotNull yWS yws) {
        Intrinsics.checkNotNullParameter(annotation, "");
        Intrinsics.checkNotNullParameter(yws, "");
        InterfaceC56658yNn interfaceC56658yNnAEQbTJ = AEQbTJ(C59160zbm.EZpvd(yws, annotation.getId()));
        java.util.Map mapKWHzl = C56424yEw.KWHzl();
        if (annotation.getArgumentCount() != 0 && !C59370zfk.KWHzl(interfaceC56658yNnAEQbTJ) && yYH.djBIcL(interfaceC56658yNnAEQbTJ)) {
            java.util.Collection<InterfaceC56656yNl> collectionDjBIcL = interfaceC56658yNnAEQbTJ.djBIcL();
            Intrinsics.checkNotNullExpressionValue(collectionDjBIcL, "");
            InterfaceC56656yNl interfaceC56656yNl = (InterfaceC56656yNl) CollectionsKt___CollectionsKt.iRxXKY(collectionDjBIcL);
            if (interfaceC56656yNl != null) {
                java.util.List<InterfaceC56695yOx> listFetchVPNInfo = interfaceC56656yNl.fetchVPNInfo();
                Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listFetchVPNInfo, 10)), 16));
                for (java.lang.Object obj : listFetchVPNInfo) {
                    linkedHashMap.put(((InterfaceC56695yOx) obj).bR_(), obj);
                }
                java.util.List<ProtoBuf.Annotation.Argument> argumentList = annotation.getArgumentList();
                Intrinsics.checkNotNullExpressionValue(argumentList, "");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (ProtoBuf.Annotation.Argument argument : argumentList) {
                    Intrinsics.copydefault(argument);
                    kotlin.Pair<C56935yXu, AbstractC56975yZg<?>> pairKWHzl = KWHzl(argument, linkedHashMap, yws);
                    if (pairKWHzl != null) {
                        arrayList.add(pairKWHzl);
                    }
                }
                mapKWHzl = C56424yEw.copydefault(arrayList);
            }
        }
        return new yOG(interfaceC56658yNnAEQbTJ.bQ_(), mapKWHzl, InterfaceC56686yOo.copydefault);
    }

    public final kotlin.Pair<C56935yXu, AbstractC56975yZg<?>> KWHzl(ProtoBuf.Annotation.Argument argument, java.util.Map<C56935yXu, ? extends InterfaceC56695yOx> map, yWS yws) {
        InterfaceC56695yOx interfaceC56695yOx = map.get(C59160zbm.OLrzqt(yws, argument.getNameId()));
        if (interfaceC56695yOx == null) {
            return null;
        }
        C56935yXu c56935yXuOLrzqt = C59160zbm.OLrzqt(yws, argument.getNameId());
        AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56695yOx.uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
        ProtoBuf.Annotation.Argument.Value value = argument.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return new kotlin.Pair<>(c56935yXuOLrzqt, EZpvd(abstractC59233zdFUzCIH, value, yws));
    }

    public final AbstractC56975yZg<?> EZpvd(AbstractC59233zdF abstractC59233zdF, ProtoBuf.Annotation.Argument.Value value, yWS yws) {
        AbstractC56975yZg<?> abstractC56975yZgOLrzqt = OLrzqt(abstractC59233zdF, value, yws);
        if (!EZpvd(abstractC56975yZgOLrzqt, abstractC59233zdF, value)) {
            abstractC56975yZgOLrzqt = null;
        }
        if (abstractC56975yZgOLrzqt != null) {
            return abstractC56975yZgOLrzqt;
        }
        return AbstractC56979yZk.AEQbTJ.OLrzqt("Unexpected argument value: actual type " + value.getType() + " != expected type " + abstractC59233zdF);
    }

    public final AbstractC56975yZg<?> OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull ProtoBuf.Annotation.Argument.Value value, @NotNull yWS yws) {
        AbstractC56975yZg<?> c56994yZz;
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(value, "");
        Intrinsics.checkNotNullParameter(yws, "");
        java.lang.Boolean boolKWHzl = yWP.OcIXYQ.KWHzl(value.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolKWHzl, "");
        boolean zBooleanValue = boolKWHzl.booleanValue();
        ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        switch (type == null ? -1 : Activity.KWHzl[type.ordinal()]) {
            case 1:
                byte intValue = (byte) value.getIntValue();
                c56994yZz = zBooleanValue ? new C56994yZz(intValue) : new C56972yZd(intValue);
                break;
            case 2:
                return new C56969yZa((char) value.getIntValue());
            case 3:
                short intValue2 = (short) value.getIntValue();
                c56994yZz = zBooleanValue ? new yZC(intValue2) : new C56991yZw(intValue2);
                break;
            case 4:
                int intValue3 = (int) value.getIntValue();
                c56994yZz = zBooleanValue ? new yZD(intValue3) : new C56983yZo(intValue3);
                break;
            case 5:
                long intValue4 = value.getIntValue();
                return zBooleanValue ? new yZB(intValue4) : new C56987yZs(intValue4);
            case 6:
                return new C56980yZl(value.getFloatValue());
            case 7:
                return new C56974yZf(value.getDoubleValue());
            case 8:
                c56994yZz = new C56973yZe(value.getIntValue() != 0);
                break;
            case 9:
                return new C56993yZy(yws.KWHzl(value.getStringValue()));
            case 10:
                return new C56984yZp(C59160zbm.EZpvd(yws, value.getClassId()), value.getArrayDimensionCount());
            case 11:
                return new C56981yZm(C59160zbm.EZpvd(yws, value.getClassId()), C59160zbm.OLrzqt(yws, value.getEnumValueId()));
            case 12:
                ProtoBuf.Annotation annotation = value.getAnnotation();
                Intrinsics.checkNotNullExpressionValue(annotation, "");
                c56994yZz = new C56970yZb(copydefault(annotation, yws));
                break;
            case 13:
                C56978yZj c56978yZj = C56978yZj.OLrzqt;
                java.util.List<ProtoBuf.Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                Intrinsics.checkNotNullExpressionValue(arrayElementList, "");
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayElementList, 10));
                for (ProtoBuf.Annotation.Argument.Value value2 : arrayElementList) {
                    AbstractC59242zdO abstractC59242zdOAhwBna = AEQbTJ().AhwBna();
                    Intrinsics.checkNotNullExpressionValue(abstractC59242zdOAhwBna, "");
                    Intrinsics.copydefault(value2);
                    arrayList.add(OLrzqt(abstractC59242zdOAhwBna, value2, yws));
                }
                return c56978yZj.copydefault(arrayList, abstractC59233zdF);
            default:
                throw new java.lang.IllegalStateException(("Unsupported annotation argument type: " + value.getType() + " (expected " + abstractC59233zdF + ')').toString());
        }
        return c56994yZz;
    }

    public final boolean EZpvd(AbstractC56975yZg<?> abstractC56975yZg, AbstractC59233zdF abstractC59233zdF, ProtoBuf.Annotation.Argument.Value value) {
        ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        int i = type == null ? -1 : Activity.KWHzl[type.ordinal()];
        if (i != 10) {
            if (i == 13) {
                if (abstractC56975yZg instanceof C56971yZc) {
                    C56971yZc c56971yZc = (C56971yZc) abstractC56975yZg;
                    if (c56971yZc.KWHzl().size() == value.getArrayElementList().size()) {
                        AbstractC59233zdF fieldNames = AEQbTJ().getFieldNames(abstractC59233zdF);
                        if (fieldNames == null) {
                            return false;
                        }
                        java.lang.Iterable iterableValueOf = yDY.valueOf((java.util.Collection<?>) c56971yZc.KWHzl());
                        if (!(iterableValueOf instanceof java.util.Collection) || !((java.util.Collection) iterableValueOf).isEmpty()) {
                            java.util.Iterator it = iterableValueOf.iterator();
                            while (it.hasNext()) {
                                int iNextInt = ((AbstractC56415yEn) it).nextInt();
                                AbstractC56975yZg<?> abstractC56975yZg2 = c56971yZc.KWHzl().get(iNextInt);
                                ProtoBuf.Annotation.Argument.Value arrayElement = value.getArrayElement(iNextInt);
                                Intrinsics.checkNotNullExpressionValue(arrayElement, "");
                                if (!EZpvd(abstractC56975yZg2, fieldNames, arrayElement)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
                throw new java.lang.IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC56975yZg).toString());
            }
            return Intrinsics.EZpvd(abstractC56975yZg.OLrzqt(this.AEQbTJ), abstractC59233zdF);
        }
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = abstractC59233zdF.djBIcL().OLrzqt();
        InterfaceC56658yNn interfaceC56658yNn = interfaceC56663yNsOLrzqt instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsOLrzqt : null;
        if (interfaceC56658yNn != null && !AbstractC56640yMw.KWHzl(interfaceC56658yNn)) {
            return false;
        }
        return true;
    }

    public final InterfaceC56658yNn AEQbTJ(C56929yXo c56929yXo) {
        return yNE.OLrzqt(this.AEQbTJ, c56929yXo, this.copydefault);
    }
}
