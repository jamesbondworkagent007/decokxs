package com.sparrowwallet.hummingbird.fountain;

import androidx.camera.video.AudioStats;
import com.sparrowwallet.hummingbird.ResultType;
import com.sparrowwallet.hummingbird.fountain.FountainDecoder;
import com.sparrowwallet.hummingbird.fountain.FountainEncoder;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes12.dex */
public class FountainDecoder {
    private long checksum;
    private long expectedChecksum;
    private int expectedFragmentLen;
    private int expectedMessageLen;
    private Set<Integer> expectedPartIndexes;
    private Set<Integer> lastPartIndexes;
    private Result result;
    private final Set<Integer> recievedPartIndexes = new TreeSet();
    private final Set<Integer> processedPartHashes = new HashSet();
    private int processedPartsCount = 0;
    private final Map<List<Integer>, Part> simpleParts = new HashMap();
    private Map<List<Integer>, Part> mixedParts = new HashMap();
    private final List<Part> queuedParts = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<Integer> getLastPartIndexes() {
        return this.lastPartIndexes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getProcessedPartsCount() {
        return this.processedPartsCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<Integer> getRecievedPartIndexes() {
        return this.recievedPartIndexes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Result getResult() {
        return this.result;
    }

    public int getExpectedPartCount() {
        Set<Integer> set = this.expectedPartIndexes;
        if (set == null) {
            return 0;
        }
        return set.size();
    }

    public double getEstimatedPercentComplete() {
        if (this.processedPartsCount == 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        return Math.min(0.99d, ((double) this.processedPartsCount) / (((double) getExpectedPartCount()) * 1.75d));
    }

    public static class Part {
        private final byte[] data;
        private final List<Integer> partIndexes;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Marked for inline */
        /* JADX DEBUG: Method not inlined, still used in: [com.sparrowwallet.hummingbird.fountain.FountainDecoder$$ExternalSyntheticLambda4.apply(java.lang.Object):java.lang.Object] */
        /* JADX INFO: renamed from: -$$Nest$fgetdata, reason: not valid java name */
        public static /* bridge */ /* synthetic */ byte[] m7368$$Nest$fgetdata(Part part) {
            return part.data;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getIndex() {
            return this.partIndexes.get(0).intValue();
        }

        public Part(FountainEncoder.Part part) {
            this.partIndexes = FountainUtils.chooseFragments(part.getSeqNum(), part.getSeqLen(), part.getChecksum());
            this.data = part.getData();
        }

        public Part(List<Integer> list, byte[] bArr) {
            this.partIndexes = list;
            this.data = bArr;
        }

        public boolean isSimple() {
            return this.partIndexes.size() == 1;
        }
    }

    public static class Result {
        public final byte[] data;
        public final String error;
        public final ResultType type;

        public Result(ResultType resultType, byte[] bArr, String str) {
            this.type = resultType;
            this.data = bArr;
            this.error = str;
        }
    }

    public boolean receivePart(FountainEncoder.Part part) {
        if (this.result != null || !validatePart(part)) {
            return false;
        }
        Part part2 = new Part(part);
        this.lastPartIndexes = new HashSet(part2.partIndexes);
        enqueue(part2);
        while (this.result == null && !this.queuedParts.isEmpty()) {
            processQueueItem();
        }
        if (this.processedPartHashes.add(Integer.valueOf(part.hashCode()))) {
            this.processedPartsCount++;
        }
        return true;
    }

    private void enqueue(Part part) {
        this.queuedParts.add(part);
    }

    private void printPartEnd() {
        int iRound = (int) Math.round(getEstimatedPercentComplete() * 100.0d);
        System.out.println("processed: " + this.processedPartsCount + " expected: " + getExpectedPartCount() + " received: " + this.recievedPartIndexes.size() + " percent: " + iRound + "%");
    }

    private void printPart(Part part) {
        List list = (List) part.partIndexes.stream().sorted().collect(Collectors.toList());
        System.out.println("part indexes: " + list);
    }

    private void printState() {
        List list = (List) this.recievedPartIndexes.stream().sorted().collect(Collectors.toList());
        List list2 = (List) this.mixedParts.keySet().stream().map(new Function() { // from class: com.sparrowwallet.hummingbird.fountain.FountainDecoder$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FountainDecoder.lambda$printState$0((List) obj);
            }
        }).collect(Collectors.toList());
        System.out.println("parts: " + getExpectedPartCount() + ", received: " + list + ", mixed: " + list2 + ", queued: " + this.queuedParts.size() + ", result: " + this.result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$printState$0(List list) {
        list.sort(Comparator.naturalOrder());
        return list;
    }

    private void processQueueItem() {
        Part partRemove = this.queuedParts.remove(0);
        if (partRemove.isSimple()) {
            processSimplePart(partRemove);
        } else {
            processMixedPart(partRemove);
        }
    }

    private void reduceMixed(final Part part) {
        List list = (List) this.mixedParts.values().stream().map(new Function() { // from class: com.sparrowwallet.hummingbird.fountain.FountainDecoder$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.lambda$reduceMixed$1(part, (FountainDecoder.Part) obj);
            }
        }).collect(Collectors.toList());
        final HashMap map = new HashMap();
        list.forEach(new Consumer() { // from class: com.sparrowwallet.hummingbird.fountain.FountainDecoder$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.lambda$reduceMixed$2(map, (FountainDecoder.Part) obj);
            }
        });
        this.mixedParts = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reduceMixed$2(Map map, Part part) {
        if (part.isSimple()) {
            enqueue(part);
        } else {
            map.put(part.partIndexes, part);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: lambda$reduceMixed$1(Lcom/sparrowwallet/hummingbird/fountain/FountainDecoder$Part;Lcom/sparrowwallet/hummingbird/fountain/FountainDecoder$Part;)Lcom/sparrowwallet/hummingbird/fountain/FountainDecoder$Part; */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reducePart, reason: merged with bridge method [inline-methods] */
    public Part lambda$reduceMixed$1(Part part, Part part2) {
        if (!part.partIndexes.containsAll(part2.partIndexes)) {
            return part;
        }
        ArrayList arrayList = new ArrayList(part.partIndexes);
        arrayList.removeAll(part2.partIndexes);
        return new Part(arrayList, FountainEncoder.xor(part.data, part2.data));
    }

    private void processSimplePart(Part part) {
        Integer num = (Integer) part.partIndexes.get(0);
        if (this.recievedPartIndexes.contains(num)) {
            return;
        }
        this.simpleParts.put(part.partIndexes, part);
        this.recievedPartIndexes.add(num);
        if (this.recievedPartIndexes.equals(this.expectedPartIndexes)) {
            byte[] bArrJoinFragments = joinFragments((List) ((List) this.simpleParts.values().stream().sorted(Comparator.comparingInt(new ToIntFunction() { // from class: com.sparrowwallet.hummingbird.fountain.FountainDecoder$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return FountainDecoder.lambda$processSimplePart$3((FountainDecoder.Part) obj);
                }
            })).collect(Collectors.toList())).stream().map(new Function() { // from class: com.sparrowwallet.hummingbird.fountain.FountainDecoder$$ExternalSyntheticLambda4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return FountainDecoder.Part.m7368$$Nest$fgetdata((FountainDecoder.Part) obj);
                }
            }).collect(Collectors.toList()), this.expectedMessageLen);
            CRC32 crc32 = new CRC32();
            crc32.update(bArrJoinFragments);
            long value = crc32.getValue();
            this.checksum = value;
            if (value == this.expectedChecksum) {
                this.result = new Result(ResultType.SUCCESS, bArrJoinFragments, null);
                return;
            } else {
                this.result = new Result(ResultType.FAILURE, null, "Invalid checksum");
                return;
            }
        }
        reduceMixed(part);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$processSimplePart$3(Object obj) {
        return ((Part) obj).getIndex();
    }

    private void processMixedPart(Part part) {
        if (this.mixedParts.containsKey(part.partIndexes)) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.simpleParts.values());
        arrayList.addAll(this.mixedParts.values());
        Part part2 = (Part) arrayList.stream().reduce(part, new BinaryOperator() { // from class: com.sparrowwallet.hummingbird.fountain.FountainDecoder$$ExternalSyntheticLambda5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return this.f$0.lambda$reduceMixed$1((FountainDecoder.Part) obj, (FountainDecoder.Part) obj2);
            }
        });
        if (part2.isSimple()) {
            enqueue(part2);
        } else {
            reduceMixed(part2);
            this.mixedParts.put(part2.partIndexes, part2);
        }
    }

    private boolean validatePart(FountainEncoder.Part part) {
        if (this.expectedPartIndexes != null) {
            return getExpectedPartCount() == part.getSeqLen() && this.expectedMessageLen == part.getMessageLen() && this.expectedChecksum == part.getChecksum() && this.expectedFragmentLen == part.getData().length;
        }
        this.expectedPartIndexes = (Set) IntStream.range(0, part.getSeqLen()).boxed().collect(Collectors.toSet());
        this.expectedMessageLen = part.getMessageLen();
        this.expectedChecksum = part.getChecksum();
        this.expectedFragmentLen = part.getData().length;
        return true;
    }

    public static byte[] joinFragments(List<byte[]> list, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (byte[] bArr : list) {
            byteArrayOutputStream.write(bArr, 0, bArr.length);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr2 = new byte[i];
        System.arraycopy(byteArray, 0, bArr2, 0, i);
        return bArr2;
    }
}
