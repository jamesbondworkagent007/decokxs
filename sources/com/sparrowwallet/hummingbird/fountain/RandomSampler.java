package com.sparrowwallet.hummingbird.fountain;

import androidx.camera.video.AudioStats;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes12.dex */
public class RandomSampler {
    private final int[] aliases;
    private final double[] probs;

    public RandomSampler(List<Double> list) {
        if (list.stream().anyMatch(new Predicate() { // from class: com.sparrowwallet.hummingbird.fountain.RandomSampler$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return RandomSampler.lambda$new$0((Double) obj);
            }
        })) {
            throw new IllegalArgumentException("Probabilties must be > 0");
        }
        final double dDoubleValue = list.stream().reduce(Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE), new BinaryOperator() { // from class: com.sparrowwallet.hummingbird.fountain.RandomSampler$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Double.valueOf(Double.sum(((Double) obj).doubleValue(), ((Double) obj2).doubleValue()));
            }
        }).doubleValue();
        final int size = list.size();
        List list2 = (List) list.stream().map(new Function() { // from class: com.sparrowwallet.hummingbird.fountain.RandomSampler$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return RandomSampler.lambda$new$1(size, dDoubleValue, (Double) obj);
            }
        }).collect(Collectors.toList());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = size - 1; i >= 0; i--) {
            if (((Double) list2.get(i)).doubleValue() < 1.0d) {
                arrayList.add(Integer.valueOf(i));
            } else {
                arrayList2.add(Integer.valueOf(i));
            }
        }
        double[] dArr = new double[size];
        int[] iArr = new int[size];
        while (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
            int iIntValue = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
            int iIntValue2 = ((Integer) arrayList2.remove(arrayList2.size() - 1)).intValue();
            dArr[iIntValue] = ((Double) list2.get(iIntValue)).doubleValue();
            iArr[iIntValue] = iIntValue2;
            list2.set(iIntValue2, Double.valueOf((((Double) list2.get(iIntValue2)).doubleValue() + ((Double) list2.get(iIntValue)).doubleValue()) - 1.0d));
            if (((Double) list2.get(iIntValue2)).doubleValue() < 1.0d) {
                arrayList.add(Integer.valueOf(iIntValue2));
            } else {
                arrayList2.add(Integer.valueOf(iIntValue2));
            }
        }
        while (!arrayList2.isEmpty()) {
            dArr[((Integer) arrayList2.remove(arrayList2.size() - 1)).intValue()] = 1.0d;
        }
        while (!arrayList.isEmpty()) {
            dArr[((Integer) arrayList.remove(arrayList.size() - 1)).intValue()] = 1.0d;
        }
        this.probs = dArr;
        this.aliases = iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(Double d) {
        return d.doubleValue() < AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$new$1(int i, double d, Double d2) {
        return Double.valueOf((d2.doubleValue() * ((double) i)) / d);
    }

    public int next(Random random) {
        double dNextDouble = random.nextDouble();
        double dNextDouble2 = random.nextDouble();
        double[] dArr = this.probs;
        int length = (int) (((double) dArr.length) * dNextDouble);
        return dNextDouble2 < dArr[length] ? length : this.aliases[length];
    }
}
