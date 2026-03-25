package o;

import com.amplitude.experiment.evaluation.EvaluationAllocation;
import com.amplitude.experiment.evaluation.EvaluationCondition;
import com.amplitude.experiment.evaluation.EvaluationContext;
import com.amplitude.experiment.evaluation.EvaluationDistribution;
import com.amplitude.experiment.evaluation.EvaluationFlag;
import com.amplitude.experiment.evaluation.EvaluationSegment;
import com.amplitude.experiment.evaluation.EvaluationVariant;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;
import o.C56403yEb;
import o.InterfaceC5293Md;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes2.dex */
public final class LY {
    public final LV EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LY() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final class StateListAnimator implements InterfaceC5293Md {
        public final EvaluationContext KWHzl;
        public final java.util.Map<java.lang.String, EvaluationVariant> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.LY$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, EvaluationContext evaluationContext, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                evaluationContext = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                map = stateListAnimator.copydefault;
            }
            return stateListAnimator.OLrzqt(evaluationContext, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull EvaluationContext evaluationContext, @NotNull java.util.Map<java.lang.String, EvaluationVariant> map) {
            Intrinsics.checkNotNullParameter(evaluationContext, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new StateListAnimator(evaluationContext, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "EvaluationTarget(context=" + this.KWHzl + ", result=" + this.copydefault + ')';
        }

        public StateListAnimator(@NotNull EvaluationContext evaluationContext, @NotNull java.util.Map<java.lang.String, EvaluationVariant> map) {
            Intrinsics.checkNotNullParameter(evaluationContext, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.KWHzl = evaluationContext;
            this.copydefault = map;
        }

        public java.lang.Object KWHzl(java.util.List<java.lang.String> list) {
            return InterfaceC5293Md.StateListAnimator.AEQbTJ(this, list);
        }

        @Override // o.InterfaceC5293Md
        public java.lang.Object AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "context")) {
                return this.KWHzl;
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "result")) {
                return this.copydefault;
            }
            return null;
        }
    }

    public LY(LV lv) {
        this.EZpvd = lv;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.LV:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.LV:0x0008: CONSTRUCTOR 
  (null com.amplitude.experiment.evaluation.Level)
  (null java.lang.String)
  (3 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.amplitude.experiment.evaluation.Level, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:15) call: o.LX.<init>(com.amplitude.experiment.evaluation.Level, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r1v0 o.LV))
 A[MD:(o.LV):void (m)] (LINE:15) call: o.LY.<init>(o.LV):void type: THIS */
    public /* synthetic */ LY(LV lv, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LX(null, null, 3, null) : lv);
    }

    public java.util.Map<java.lang.String, EvaluationVariant> AEQbTJ(@NotNull final EvaluationContext evaluationContext, @NotNull final java.util.List<EvaluationFlag> list) {
        Intrinsics.checkNotNullParameter(evaluationContext, "");
        Intrinsics.checkNotNullParameter(list, "");
        LV lv = this.EZpvd;
        if (lv != null) {
            lv.KWHzl(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$evaluate$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evaluating flags ");
                    List<EvaluationFlag> list2 = list;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((EvaluationFlag) it.next()).KWHzl());
                    }
                    sb.append(arrayList);
                    sb.append(" with context ");
                    sb.append(evaluationContext);
                    sb.append('.');
                    return sb.toString();
                }
            });
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        StateListAnimator stateListAnimator = new StateListAnimator(evaluationContext, linkedHashMap);
        for (final EvaluationFlag evaluationFlag : list) {
            EvaluationVariant evaluationVariantCopydefault = copydefault(stateListAnimator, evaluationFlag);
            if (evaluationVariantCopydefault != null) {
                linkedHashMap.put(evaluationFlag.KWHzl(), evaluationVariantCopydefault);
            } else {
                LV lv2 = this.EZpvd;
                if (lv2 != null) {
                    lv2.KWHzl(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$evaluate$2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Flag " + evaluationFlag.KWHzl() + " evaluation returned a null result.";
                        }
                    });
                }
            }
        }
        LV lv3 = this.EZpvd;
        if (lv3 != null) {
            lv3.KWHzl(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$evaluate$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Evaluation completed. " + linkedHashMap;
                }
            });
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.amplitude.experiment.evaluation.EvaluationVariant] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, com.amplitude.experiment.evaluation.EvaluationVariant] */
    public final EvaluationVariant copydefault(final StateListAnimator stateListAnimator, final EvaluationFlag evaluationFlag) {
        LV lv = this.EZpvd;
        if (lv != null) {
            lv.OLrzqt(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$evaluateFlag$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Evaluating flag " + evaluationFlag + " with target " + stateListAnimator + '.';
                }
            });
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        java.util.Iterator<EvaluationSegment> it = evaluationFlag.copydefault().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            final EvaluationSegment next = it.next();
            ?? AEQbTJ = AEQbTJ(stateListAnimator, evaluationFlag, next);
            objectRef.element = AEQbTJ;
            if (AEQbTJ != 0) {
                objectRef.element = new EvaluationVariant(((EvaluationVariant) objectRef.element).OLrzqt(), ((EvaluationVariant) objectRef.element).copydefault(), ((EvaluationVariant) objectRef.element).KWHzl(), copydefault(evaluationFlag.OLrzqt(), next.copydefault(), ((EvaluationVariant) objectRef.element).EZpvd()));
                LV lv2 = this.EZpvd;
                if (lv2 != null) {
                    lv2.OLrzqt(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$evaluateFlag$2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Flag evaluation returned result " + objectRef.element + " on segment " + next + '.';
                        }
                    });
                }
            }
        }
        return (EvaluationVariant) objectRef.element;
    }

    public final EvaluationVariant AEQbTJ(final StateListAnimator stateListAnimator, EvaluationFlag evaluationFlag, final EvaluationSegment evaluationSegment) {
        LV lv = this.EZpvd;
        if (lv != null) {
            lv.OLrzqt(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$evaluateSegment$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Evaluating segment " + evaluationSegment + " with target " + stateListAnimator + '.';
                }
            });
        }
        if (evaluationSegment.AEQbTJ() == null) {
            LV lv2 = this.EZpvd;
            if (lv2 != null) {
                lv2.OLrzqt(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$evaluateSegment$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Segment conditions are null, bucketing target.";
                    }
                });
            }
            return evaluationFlag.valueOf().get(OLrzqt(stateListAnimator, evaluationSegment));
        }
        java.util.Iterator<java.util.List<EvaluationCondition>> it = evaluationSegment.AEQbTJ().iterator();
        while (it.hasNext()) {
            java.util.Iterator<EvaluationCondition> it2 = it.next().iterator();
            boolean z = true;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                final EvaluationCondition next = it2.next();
                boolean zKWHzl = KWHzl(stateListAnimator, next);
                if (zKWHzl) {
                    LV lv3 = this.EZpvd;
                    if (lv3 != null) {
                        lv3.OLrzqt(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$evaluateSegment$4
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            {
                                super(0);
                            }

                            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Segment condition " + next + " matched target.";
                            }
                        });
                    }
                    z = zKWHzl;
                } else {
                    LV lv4 = this.EZpvd;
                    if (lv4 != null) {
                        lv4.OLrzqt(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$evaluateSegment$3
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            {
                                super(0);
                            }

                            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Segment condition " + next + " did not match target.";
                            }
                        });
                    }
                    z = zKWHzl;
                }
            }
            if (z) {
                LV lv5 = this.EZpvd;
                if (lv5 != null) {
                    lv5.OLrzqt(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$evaluateSegment$5
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Segment conditions matched, bucketing target.";
                        }
                    });
                }
                return evaluationFlag.valueOf().get(OLrzqt(stateListAnimator, evaluationSegment));
            }
        }
        return null;
    }

    public final boolean KWHzl(StateListAnimator stateListAnimator, EvaluationCondition evaluationCondition) {
        java.lang.Object objKWHzl = stateListAnimator.KWHzl(evaluationCondition.AEQbTJ());
        if (objKWHzl == null) {
            return EZpvd(evaluationCondition.OLrzqt(), evaluationCondition.copydefault());
        }
        if (KWHzl(evaluationCondition.OLrzqt())) {
            java.util.Set<java.lang.String> setKWHzl = KWHzl(objKWHzl);
            if (setKWHzl == null) {
                return false;
            }
            return KWHzl(setKWHzl, evaluationCondition.OLrzqt(), evaluationCondition.copydefault());
        }
        java.lang.String strCopydefault = copydefault(objKWHzl);
        if (strCopydefault == null) {
            return false;
        }
        return OLrzqt(strCopydefault, evaluationCondition.OLrzqt(), evaluationCondition.copydefault());
    }

    public final long copydefault(java.lang.String str) {
        byte[] newProxyInstance = C59449zhJ.getNewProxyInstance(str);
        return ((long) C5290Ma.AEQbTJ.KWHzl(newProxyInstance, newProxyInstance.length, 0)) & BodyPartID.bodyIdMax;
    }

    public final java.lang.String OLrzqt(final StateListAnimator stateListAnimator, final EvaluationSegment evaluationSegment) {
        LV lv = this.EZpvd;
        if (lv != null) {
            lv.OLrzqt(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$bucket$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Bucketing segment " + evaluationSegment + " with target " + stateListAnimator;
                }
            });
        }
        if (evaluationSegment.EZpvd() == null) {
            LV lv2 = this.EZpvd;
            if (lv2 != null) {
                lv2.OLrzqt(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$bucket$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Segment bucket is null, returning default variant " + evaluationSegment.KWHzl() + '.';
                    }
                });
            }
            return evaluationSegment.KWHzl();
        }
        final java.lang.String strCopydefault = copydefault(stateListAnimator.KWHzl(evaluationSegment.EZpvd().AEQbTJ()));
        LV lv3 = this.EZpvd;
        if (lv3 != null) {
            lv3.OLrzqt(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$bucket$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Selected bucketing value " + strCopydefault + " from target.";
                }
            });
        }
        if (strCopydefault == null || strCopydefault.length() == 0) {
            LV lv4 = this.EZpvd;
            if (lv4 != null) {
                lv4.OLrzqt(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$bucket$4
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Selected bucketing value is null or empty.";
                    }
                });
            }
            return evaluationSegment.KWHzl();
        }
        long jCopydefault = copydefault(evaluationSegment.EZpvd().copydefault() + JsonPointer.SEPARATOR + strCopydefault);
        long j = (long) 100;
        long j2 = jCopydefault % j;
        long j3 = jCopydefault / j;
        if ((jCopydefault ^ j) < 0 && j * j3 != jCopydefault) {
            j3--;
        }
        for (EvaluationAllocation evaluationAllocation : evaluationSegment.EZpvd().KWHzl()) {
            int iIntValue = evaluationAllocation.copydefault().get(0).intValue();
            int iIntValue2 = evaluationAllocation.copydefault().get(1).intValue();
            if (iIntValue <= j2 && j2 < iIntValue2) {
                for (final EvaluationDistribution evaluationDistribution : evaluationAllocation.KWHzl()) {
                    int iIntValue3 = evaluationDistribution.OLrzqt().get(0).intValue();
                    int iIntValue4 = evaluationDistribution.OLrzqt().get(1).intValue();
                    if (iIntValue3 <= j3 && j3 < iIntValue4) {
                        LV lv5 = this.EZpvd;
                        if (lv5 != null) {
                            lv5.OLrzqt(new Function0<java.lang.String>() { // from class: com.amplitude.experiment.evaluation.EvaluationEngineImpl$bucket$5
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                {
                                    super(0);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function0
                                public final String invoke() {
                                    return "Bucketing hit allocation and distribution, returning variant " + evaluationDistribution.copydefault() + '.';
                                }
                            });
                        }
                        return evaluationDistribution.copydefault();
                    }
                }
            }
        }
        return evaluationSegment.KWHzl();
    }

    public final java.util.Map<java.lang.String, java.lang.Object> copydefault(java.util.Map<java.lang.String, ? extends java.lang.Object>... mapArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.util.Map<java.lang.String, ? extends java.lang.Object> map : mapArr) {
            if (map != null) {
                linkedHashMap.putAll(map);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(java.lang.String str, java.util.Set<java.lang.String> set) {
        boolean zCopydefault = copydefault(set);
        switch (str.hashCode()) {
            case -1800746656:
                if (str.equals("does not contain")) {
                    if (!zCopydefault) {
                    }
                }
                break;
            case -1559257059:
                if (!str.equals("greater or equal")) {
                }
                break;
            case -1537279909:
                if (!str.equals("set is not")) {
                }
                break;
            case -1506980514:
                if (!str.equals("less or equal")) {
                }
                break;
            case -1181638947:
                if (str.equals("is not")) {
                }
                break;
            case -905849432:
                if (!str.equals("set is")) {
                }
                break;
            case -567445985:
                if (!str.equals("contains")) {
                }
                break;
            case -303243938:
                if (str.equals("set does not contain")) {
                }
                break;
            case -219951950:
                if (!str.equals("version greater")) {
                }
                break;
            case -160908319:
                if (!str.equals("version less")) {
                }
                break;
            case 3370:
                if (!str.equals("is")) {
                }
                break;
            case 3318169:
                if (!str.equals("less")) {
                }
                break;
            case 283601914:
                if (str.equals("greater")) {
                }
                break;
            case 996610634:
                if (!str.equals("regex does not match")) {
                }
                break;
            case 1198720042:
                if (str.equals("set does not contain any")) {
                }
                break;
            case 1258973213:
                if (!str.equals("set contains")) {
                }
                break;
            case 1524976812:
                str.equals("regex match");
                break;
            case 1539870309:
                if (!str.equals("version greater or equal")) {
                }
                break;
            case 1899960169:
                if (!str.equals("set contains any")) {
                }
                break;
            case 1994146838:
                if (!str.equals("version less or equal")) {
                }
                break;
        }
        return zCopydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [215=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean KWHzl(java.util.Set<java.lang.String> set, java.lang.String str, java.util.Set<java.lang.String> set2) {
        switch (str.hashCode()) {
            case -1537279909:
                return str.equals("set is not") && !Intrinsics.EZpvd(set, set2);
            case -905849432:
                if (str.equals("set is")) {
                    return Intrinsics.EZpvd(set, set2);
                }
            case -303243938:
                if (str.equals("set does not contain") && !copydefault(set, set2)) {
                }
                break;
            case 1198720042:
                if (str.equals("set does not contain any") && !KWHzl(set, set2)) {
                }
                break;
            case 1258973213:
                if (str.equals("set contains")) {
                    return copydefault(set, set2);
                }
            case 1899960169:
                if (str.equals("set contains any")) {
                    return KWHzl(set, set2);
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [231=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r3.equals("greater") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r3.equals("less") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (r3.equals("version less") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if (r3.equals("version greater") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
    
        if (r3.equals("less or equal") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a9, code lost:
    
        if (r3.equals("greater or equal") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return KWHzl(r2, r3, r4, com.amplitude.experiment.evaluation.EvaluationEngineImpl$matchString$2.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return KWHzl(r2, r3, r4, new com.amplitude.experiment.evaluation.EvaluationEngineImpl$matchString$1(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r3.equals("version less or equal") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r3.equals("version greater or equal") == false) goto L61;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OLrzqt(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) {
        switch (str2.hashCode()) {
            case -1800746656:
                return str2.equals("does not contain") && !OLrzqt(str, set);
            case -1559257059:
                break;
            case -1506980514:
                break;
            case -1181638947:
                if (str2.equals("is not") && !KWHzl(str, set)) {
                }
                break;
            case -567445985:
                if (str2.equals("contains")) {
                    return OLrzqt(str, set);
                }
            case -219951950:
                break;
            case -160908319:
                break;
            case 3370:
                if (str2.equals("is")) {
                    return KWHzl(str, set);
                }
            case 3318169:
                break;
            case 283601914:
                break;
            case 996610634:
                if (str2.equals("regex does not match") && !copydefault(str, set)) {
                }
                break;
            case 1524976812:
                if (str2.equals("regex match")) {
                    return copydefault(str, set);
                }
            case 1539870309:
                break;
            case 1994146838:
                break;
        }
    }

    public final boolean KWHzl(java.lang.String str, java.util.Set<java.lang.String> set) {
        if (OLrzqt(set)) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "true") || Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "false")) {
                java.util.Set<java.lang.String> set2 = set;
                if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
                    java.util.Iterator<T> it = set2.iterator();
                    while (it.hasNext()) {
                        java.lang.String lowerCase2 = ((java.lang.String) it.next()).toLowerCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                        if (Intrinsics.EZpvd((java.lang.Object) lowerCase2, (java.lang.Object) lowerCase)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return set.contains(str);
    }

    public final boolean OLrzqt(java.lang.String str, java.util.Set<java.lang.String> set) {
        for (java.lang.String str2 : set) {
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String lowerCase2 = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) lowerCase2, false, 2, (java.lang.Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean copydefault(java.util.Set<java.lang.String> set, java.util.Set<java.lang.String> set2) {
        if (set.size() < set2.size()) {
            return false;
        }
        java.util.Iterator<java.lang.String> it = set2.iterator();
        while (it.hasNext()) {
            if (!KWHzl(it.next(), set)) {
                return false;
            }
        }
        return true;
    }

    public final boolean KWHzl(java.util.Set<java.lang.String> set, java.util.Set<java.lang.String> set2) {
        java.util.Iterator<java.lang.String> it = set2.iterator();
        while (it.hasNext()) {
            if (KWHzl(it.next(), set)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: ? super java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends java.lang.Comparable<? super T>> boolean KWHzl(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set, Function1<? super java.lang.String, ? extends T> function1) {
        T tInvoke = function1.invoke(str);
        java.util.Set<java.lang.String> set2 = set;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            T tInvoke2 = function1.invoke(it.next());
            if (tInvoke2 != null) {
                arrayList.add(tInvoke2);
            }
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        if (tInvoke != null && !setOqFWZa.isEmpty()) {
            java.util.Set set3 = setOqFWZa;
            if (!(set3 instanceof java.util.Collection) || !set3.isEmpty()) {
                java.util.Iterator it2 = set3.iterator();
                while (it2.hasNext()) {
                    if (OLrzqt((java.lang.Comparable<? super java.lang.Comparable>) tInvoke, str2, (java.lang.Comparable) it2.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
            java.util.Iterator<T> it3 = set2.iterator();
            while (it3.hasNext()) {
                if (OLrzqt(str, str2, (java.lang.String) it3.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r2.equals("greater") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2.equals("less") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r2.equals("version less") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r1 >= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r2.equals("version greater") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r1 <= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (r2.equals("less or equal") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (r1 > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        if (r2.equals("greater or equal") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        if (r1 < 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r2.equals("version less or equal") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r2.equals("version greater or equal") != false) goto L31;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> boolean OLrzqt(java.lang.Comparable<? super T> comparable, java.lang.String str, T t) {
        int iCompareTo = comparable.compareTo(t);
        switch (str.hashCode()) {
            case -1559257059:
                break;
            case -1506980514:
                break;
            case -219951950:
                break;
            case -160908319:
                break;
            case 3318169:
                break;
            case 283601914:
                break;
            case 1539870309:
                break;
            case 1994146838:
                break;
            default:
                throw new java.lang.IllegalArgumentException("Unexpected comparison operator " + str);
        }
    }

    public final boolean copydefault(java.lang.String str, java.util.Set<java.lang.String> set) {
        java.util.Set<java.lang.String> set2 = set;
        if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
            java.util.Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                if (new Regex((java.lang.String) it.next()).matches(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean copydefault(java.util.Set<java.lang.String> set) {
        return set.contains("(none)");
    }

    public final boolean OLrzqt(java.util.Set<java.lang.String> set) {
        java.util.Set<java.lang.String> set2 = set;
        if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
            java.util.Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                java.lang.String lowerCase = ((java.lang.String) it.next()).toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "true") || Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "false")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.lang.Double OLrzqt(java.lang.String str) {
        try {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public final java.lang.String copydefault(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof java.util.Map)) {
            if (!(obj instanceof java.util.Collection)) {
                return obj.toString();
            }
            Json json = LU.OLrzqt;
            return json.encodeToString(SerializersKt.serializer(json.getSerializersModule(), C56524yIo.copydefault(JsonArray.class)), LU.AEQbTJ((java.util.Collection) obj));
        }
        Json json2 = LU.OLrzqt;
        return json2.encodeToString(SerializersKt.serializer(json2.getSerializersModule(), C56524yIo.copydefault(JsonObject.class)), LU.OLrzqt((java.util.Map) obj));
    }

    public final java.util.Set<java.lang.String> KWHzl(java.lang.Object obj) {
        if (!(obj instanceof java.util.Collection)) {
            java.lang.String string = obj.toString();
            try {
                Json json = LU.OLrzqt;
                java.util.List listEZpvd = LU.EZpvd((JsonArray) json.decodeFromString(SerializersKt.serializer(json.getSerializersModule(), C56524yIo.copydefault(JsonArray.class)), string));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = listEZpvd.iterator();
                while (it.hasNext()) {
                    java.lang.String strCopydefault = copydefault(it.next());
                    if (strCopydefault != null) {
                        arrayList.add(strCopydefault);
                    }
                }
                return CollectionsKt___CollectionsKt.OqFWZa(arrayList);
            } catch (SerializationException unused) {
                return null;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = ((java.lang.Iterable) obj).iterator();
        while (it2.hasNext()) {
            java.lang.String strCopydefault2 = copydefault(it2.next());
            if (strCopydefault2 != null) {
                arrayList2.add(strCopydefault2);
            }
        }
        return CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean KWHzl(java.lang.String str) {
        switch (str.hashCode()) {
            case -1537279909:
                return str.equals("set is not");
            case -905849432:
                if (!str.equals("set is")) {
                }
                break;
            case -303243938:
                if (!str.equals("set does not contain")) {
                }
                break;
            case 1198720042:
                if (str.equals("set does not contain any")) {
                }
                break;
            case 1258973213:
                if (!str.equals("set contains")) {
                }
                break;
            case 1899960169:
                if (!str.equals("set contains any")) {
                }
                break;
        }
    }
}
