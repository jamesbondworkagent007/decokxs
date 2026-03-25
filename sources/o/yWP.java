package o;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import o.yXJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yWP {
    public static final TaskDescription AEQbTJ;
    public static final TaskDescription AYXKKw;
    public static final TaskDescription AhwBna;
    public static final TaskDescription AkhnZx;
    public static final TaskDescription AuCTel;
    public static final TaskDescription AuCTelauCTel;
    public static final TaskDescription AubY;
    public static final TaskDescription AwvSrB;
    public static final TaskDescription AxsJAY;
    public static final TaskDescription DTwDnp;
    public static final TaskDescription DbNXlk;
    public static final StateListAnimator<ProtoBuf.Class.Kind> EZpvd;
    public static final TaskDescription KWHzl;
    public static final TaskDescription OLrzqt;
    public static final StateListAnimator<ProtoBuf.Modality> ORxRYg;
    public static final TaskDescription OcIXYQ;
    public static final TaskDescription QKVWgx;
    public static final StateListAnimator<ProtoBuf.MemberKind> QOLQEE;
    public static final TaskDescription QUSxYX;
    public static final StateListAnimator<ProtoBuf.Visibility> RJOkX;
    public static final TaskDescription copydefault;
    public static final TaskDescription djBIcL;
    public static final TaskDescription ejfBZ;
    public static final TaskDescription fARcdN;
    public static final TaskDescription fIwbmz;
    public static final TaskDescription fJNWhG;
    public static final TaskDescription fetchVPNInfo;
    public static final TaskDescription gEmmrt;
    public static final TaskDescription gHZMYf;
    public static final TaskDescription getFieldNames;
    public static final TaskDescription getNewProxyInstance;
    public static final TaskDescription hDKMBd;
    public static final TaskDescription isConnected;
    public static final TaskDescription iwGUEr;
    public static final TaskDescription sSMYrx;
    public static final TaskDescription uzCIH;
    public static final TaskDescription valueOf;
    public static final TaskDescription values;
    public static final TaskDescription wlaJM;
    public static final TaskDescription zLjUOn;
    public static final TaskDescription zsXlph;
    public static final TaskDescription zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void EZpvd(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i == 1) {
            objArr[0] = "modality";
        } else if (i == 2) {
            objArr[0] = "kind";
        } else if (i != 5) {
            if (i == 6) {
                objArr[0] = "memberKind";
            } else if (i != 8) {
                if (i != 9) {
                    if (i != 11) {
                        objArr[0] = "visibility";
                    }
                }
            }
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    static {
        TaskDescription taskDescriptionOLrzqt = StateListAnimator.OLrzqt();
        QUSxYX = taskDescriptionOLrzqt;
        OLrzqt = StateListAnimator.KWHzl(taskDescriptionOLrzqt);
        TaskDescription taskDescriptionOLrzqt2 = StateListAnimator.OLrzqt();
        copydefault = taskDescriptionOLrzqt2;
        StateListAnimator<ProtoBuf.Visibility> stateListAnimatorEZpvd = StateListAnimator.EZpvd(taskDescriptionOLrzqt2, ProtoBuf.Visibility.values());
        RJOkX = stateListAnimatorEZpvd;
        StateListAnimator<ProtoBuf.Modality> stateListAnimatorEZpvd2 = StateListAnimator.EZpvd(stateListAnimatorEZpvd, ProtoBuf.Modality.values());
        ORxRYg = stateListAnimatorEZpvd2;
        StateListAnimator<ProtoBuf.Class.Kind> stateListAnimatorEZpvd3 = StateListAnimator.EZpvd(stateListAnimatorEZpvd2, ProtoBuf.Class.Kind.values());
        EZpvd = stateListAnimatorEZpvd3;
        TaskDescription taskDescriptionKWHzl = StateListAnimator.KWHzl(stateListAnimatorEZpvd3);
        zsXlph = taskDescriptionKWHzl;
        TaskDescription taskDescriptionKWHzl2 = StateListAnimator.KWHzl(taskDescriptionKWHzl);
        isConnected = taskDescriptionKWHzl2;
        TaskDescription taskDescriptionKWHzl3 = StateListAnimator.KWHzl(taskDescriptionKWHzl2);
        fJNWhG = taskDescriptionKWHzl3;
        TaskDescription taskDescriptionKWHzl4 = StateListAnimator.KWHzl(taskDescriptionKWHzl3);
        fetchVPNInfo = taskDescriptionKWHzl4;
        TaskDescription taskDescriptionKWHzl5 = StateListAnimator.KWHzl(taskDescriptionKWHzl4);
        QKVWgx = taskDescriptionKWHzl5;
        TaskDescription taskDescriptionKWHzl6 = StateListAnimator.KWHzl(taskDescriptionKWHzl5);
        getFieldNames = taskDescriptionKWHzl6;
        AYXKKw = StateListAnimator.KWHzl(taskDescriptionKWHzl6);
        TaskDescription taskDescriptionKWHzl7 = StateListAnimator.KWHzl(stateListAnimatorEZpvd);
        sSMYrx = taskDescriptionKWHzl7;
        gEmmrt = StateListAnimator.KWHzl(taskDescriptionKWHzl7);
        StateListAnimator<ProtoBuf.MemberKind> stateListAnimatorEZpvd4 = StateListAnimator.EZpvd(stateListAnimatorEZpvd2, ProtoBuf.MemberKind.values());
        QOLQEE = stateListAnimatorEZpvd4;
        TaskDescription taskDescriptionKWHzl8 = StateListAnimator.KWHzl(stateListAnimatorEZpvd4);
        AxsJAY = taskDescriptionKWHzl8;
        TaskDescription taskDescriptionKWHzl9 = StateListAnimator.KWHzl(taskDescriptionKWHzl8);
        iwGUEr = taskDescriptionKWHzl9;
        TaskDescription taskDescriptionKWHzl10 = StateListAnimator.KWHzl(taskDescriptionKWHzl9);
        getNewProxyInstance = taskDescriptionKWHzl10;
        TaskDescription taskDescriptionKWHzl11 = StateListAnimator.KWHzl(taskDescriptionKWHzl10);
        gHZMYf = taskDescriptionKWHzl11;
        TaskDescription taskDescriptionKWHzl12 = StateListAnimator.KWHzl(taskDescriptionKWHzl11);
        ejfBZ = taskDescriptionKWHzl12;
        TaskDescription taskDescriptionKWHzl13 = StateListAnimator.KWHzl(taskDescriptionKWHzl12);
        zuBGHE = taskDescriptionKWHzl13;
        TaskDescription taskDescriptionKWHzl14 = StateListAnimator.KWHzl(taskDescriptionKWHzl13);
        values = taskDescriptionKWHzl14;
        uzCIH = StateListAnimator.KWHzl(taskDescriptionKWHzl14);
        TaskDescription taskDescriptionKWHzl15 = StateListAnimator.KWHzl(stateListAnimatorEZpvd4);
        DTwDnp = taskDescriptionKWHzl15;
        TaskDescription taskDescriptionKWHzl16 = StateListAnimator.KWHzl(taskDescriptionKWHzl15);
        AhwBna = taskDescriptionKWHzl16;
        TaskDescription taskDescriptionKWHzl17 = StateListAnimator.KWHzl(taskDescriptionKWHzl16);
        djBIcL = taskDescriptionKWHzl17;
        TaskDescription taskDescriptionKWHzl18 = StateListAnimator.KWHzl(taskDescriptionKWHzl17);
        valueOf = taskDescriptionKWHzl18;
        TaskDescription taskDescriptionKWHzl19 = StateListAnimator.KWHzl(taskDescriptionKWHzl18);
        zLjUOn = taskDescriptionKWHzl19;
        TaskDescription taskDescriptionKWHzl20 = StateListAnimator.KWHzl(taskDescriptionKWHzl19);
        KWHzl = taskDescriptionKWHzl20;
        TaskDescription taskDescriptionKWHzl21 = StateListAnimator.KWHzl(taskDescriptionKWHzl20);
        AuCTel = taskDescriptionKWHzl21;
        TaskDescription taskDescriptionKWHzl22 = StateListAnimator.KWHzl(taskDescriptionKWHzl21);
        AkhnZx = taskDescriptionKWHzl22;
        fARcdN = StateListAnimator.KWHzl(taskDescriptionKWHzl22);
        TaskDescription taskDescriptionKWHzl23 = StateListAnimator.KWHzl(taskDescriptionOLrzqt2);
        AEQbTJ = taskDescriptionKWHzl23;
        TaskDescription taskDescriptionKWHzl24 = StateListAnimator.KWHzl(taskDescriptionKWHzl23);
        DbNXlk = taskDescriptionKWHzl24;
        wlaJM = StateListAnimator.KWHzl(taskDescriptionKWHzl24);
        TaskDescription taskDescriptionKWHzl25 = StateListAnimator.KWHzl(stateListAnimatorEZpvd2);
        AuCTelauCTel = taskDescriptionKWHzl25;
        TaskDescription taskDescriptionKWHzl26 = StateListAnimator.KWHzl(taskDescriptionKWHzl25);
        fIwbmz = taskDescriptionKWHzl26;
        hDKMBd = StateListAnimator.KWHzl(taskDescriptionKWHzl26);
        TaskDescription taskDescriptionOLrzqt3 = StateListAnimator.OLrzqt();
        AubY = taskDescriptionOLrzqt3;
        AwvSrB = StateListAnimator.KWHzl(taskDescriptionOLrzqt3);
        OcIXYQ = StateListAnimator.OLrzqt();
    }

    public static int EZpvd(boolean z, @NotNull ProtoBuf.Visibility visibility, @NotNull ProtoBuf.Modality modality, boolean z2, boolean z3, boolean z4) {
        if (visibility == null) {
            EZpvd(10);
        }
        if (modality == null) {
            EZpvd(11);
        }
        int iAEQbTJ = copydefault.AEQbTJ(java.lang.Boolean.valueOf(z));
        int iAEQbTJ2 = ORxRYg.AEQbTJ(modality);
        int iAEQbTJ3 = RJOkX.AEQbTJ(visibility);
        int iAEQbTJ4 = AuCTelauCTel.AEQbTJ(java.lang.Boolean.valueOf(z2));
        return iAEQbTJ | iAEQbTJ2 | iAEQbTJ3 | iAEQbTJ4 | fIwbmz.AEQbTJ(java.lang.Boolean.valueOf(z3)) | hDKMBd.AEQbTJ(java.lang.Boolean.valueOf(z4));
    }

    public static abstract class StateListAnimator<E> {
        public final int EZpvd;
        public final int KWHzl;

        public abstract int AEQbTJ(E e);

        public abstract E KWHzl(int i);

        /* JADX WARN: Incorrect types in method signature: <E::Lo/yXJ$Activity;>(Lo/yWP$StateListAnimator<*>;[TE;)Lo/yWP$StateListAnimator<TE;>; */
        public static StateListAnimator EZpvd(StateListAnimator stateListAnimator, yXJ.Activity[] activityArr) {
            return new Application(stateListAnimator.KWHzl + stateListAnimator.EZpvd, activityArr);
        }

        public static TaskDescription OLrzqt() {
            return new TaskDescription(0);
        }

        public static TaskDescription KWHzl(StateListAnimator<?> stateListAnimator) {
            return new TaskDescription(stateListAnimator.KWHzl + stateListAnimator.EZpvd);
        }

        public StateListAnimator(int i, int i2) {
            this.KWHzl = i;
            this.EZpvd = i2;
        }
    }

    public static class TaskDescription extends StateListAnimator<java.lang.Boolean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void OLrzqt(int i) {
            throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        public TaskDescription(int i) {
            super(i, 1);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(I)Ljava/lang/Object; */
        @Override // o.yWP.StateListAnimator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean KWHzl(int i) {
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf((i & (1 << this.KWHzl)) != 0);
            if (boolValueOf == null) {
                OLrzqt(0);
            }
            return boolValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)I */
        @Override // o.yWP.StateListAnimator
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public int AEQbTJ(java.lang.Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.KWHzl;
            }
            return 0;
        }
    }

    public static class Application<E extends yXJ.Activity> extends StateListAnimator<E> {
        public final E[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static /* synthetic */ void EZpvd(int i) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        public Application(int i, E[] eArr) {
            super(i, EZpvd(eArr));
            this.AEQbTJ = eArr;
        }

        public static <E> int EZpvd(@NotNull E[] eArr) {
            if (eArr == null) {
                EZpvd(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            throw new java.lang.IllegalStateException("Empty enum: " + eArr.getClass());
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(I)Ljava/lang/Object; */
        @Override // o.yWP.StateListAnimator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public E KWHzl(int i) {
            int i2 = this.EZpvd;
            int i3 = this.KWHzl;
            for (E e : this.AEQbTJ) {
                if (e.getNumber() == (((((1 << i2) - 1) << i3) & i) >> i3)) {
                    return e;
                }
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)I */
        @Override // o.yWP.StateListAnimator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public int AEQbTJ(E e) {
            return e.getNumber() << this.KWHzl;
        }
    }
}
