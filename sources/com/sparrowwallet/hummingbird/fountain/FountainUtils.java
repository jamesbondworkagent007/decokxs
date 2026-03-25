package com.sparrowwallet.hummingbird.fountain;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes12.dex */
public class FountainUtils {
    public static List<Integer> chooseFragments(long j, int i, long j2) {
        if (j <= i) {
            return Collections.singletonList(Integer.valueOf(((int) j) - 1));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt((int) j);
        byteBufferAllocate.putInt((int) j2);
        RandomXoshiro256StarStar randomXoshiro256StarStar = new RandomXoshiro256StarStar(byteBufferAllocate.array());
        return new ArrayList(shuffled((List) IntStream.range(0, i).boxed().collect(Collectors.toList()), randomXoshiro256StarStar).subList(0, chooseDegree(i, randomXoshiro256StarStar)));
    }

    public static int chooseDegree(int i, RandomXoshiro256StarStar randomXoshiro256StarStar) {
        return new RandomSampler((List) IntStream.range(1, i + 1).mapToObj(new IntFunction() { // from class: com.sparrowwallet.hummingbird.fountain.FountainUtils$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return FountainUtils.lambda$chooseDegree$0(i2);
            }
        }).collect(Collectors.toList())).next(randomXoshiro256StarStar) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$chooseDegree$0(int i) {
        return Double.valueOf(1.0d / ((double) i));
    }

    public static List<Integer> shuffled(List<Integer> list, RandomXoshiro256StarStar randomXoshiro256StarStar) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list.size());
        while (!arrayList.isEmpty()) {
            arrayList2.add((Integer) arrayList.remove(randomXoshiro256StarStar.nextInt(0, arrayList.size())));
        }
        return arrayList2;
    }
}
