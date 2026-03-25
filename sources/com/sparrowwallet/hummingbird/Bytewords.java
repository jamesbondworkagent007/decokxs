package com.sparrowwallet.hummingbird;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes12.dex */
public class Bytewords {
    public static final String BYTEWORDS = "ableacidalsoapexaquaarchatomauntawayaxisbackbaldbarnbeltbetabiasbluebodybragbrewbulbbuzzcalmcashcatschefcityclawcodecolacookcostcruxcurlcuspcyandarkdatadaysdelidicedietdoordowndrawdropdrumdulldutyeacheasyechoedgeepicevenexamexiteyesfactfairfernfigsfilmfishfizzflapflewfluxfoxyfreefrogfuelfundgalagamegeargemsgiftgirlglowgoodgraygrimgurugushgyrohalfhanghardhawkheathelphighhillholyhopehornhutsicedideaidleinchinkyintoirisironitemjadejazzjoinjoltjowljudojugsjumpjunkjurykeepkenokeptkeyskickkilnkingkitekiwiknoblamblavalazyleaflegsliarlimplionlistlogoloudloveluaulucklungmainmanymathmazememomenumeowmildmintmissmonknailnavyneednewsnextnoonnotenumbobeyoboeomitonyxopenovalowlspaidpartpeckplaypluspoempoolposepuffpumapurrquadquizraceramprealredorichroadrockroofrubyruinrunsrustsafesagascarsetssilkskewslotsoapsolosongstubsurfswantacotasktaxitenttiedtimetinytoiltombtoystriptunatwinuglyundouniturgeuservastveryvetovialvibeviewvisavoidvowswallwandwarmwaspwavewaxywebswhatwhenwhizwolfworkyankyawnyellyogayurtzapszerozestzinczonezoom";
    private static final List<String> bytewordsList = getBytewords();
    private static final List<String> minimalBytewordsList = getMinimalBytewords();

    public enum Style {
        STANDARD,
        URI,
        MINIMAL
    }

    public static int getEncodedLength(int i, Style style) {
        return (style == Style.STANDARD || style == Style.URI) ? (i * 4) + (i - 1) : i * 2;
    }

    public static String encode(byte[] bArr, Style style) {
        if (style == Style.STANDARD) {
            return encode(bArr, " ");
        }
        if (style == Style.URI) {
            return encode(bArr, "-");
        }
        return encodeMinimal(bArr);
    }

    public static byte[] decode(String str, Style style) {
        if (style == Style.STANDARD) {
            return decode(str, " ");
        }
        if (style == Style.URI) {
            return decode(str, "-");
        }
        return decodeMinimal(str);
    }

    private static String encode(byte[] bArr, String str) {
        final byte[] bArrAppendChecksum = appendChecksum(bArr);
        List list = (List) IntStream.range(0, bArrAppendChecksum.length).map(new IntUnaryOperator() { // from class: com.sparrowwallet.hummingbird.Bytewords$$ExternalSyntheticLambda7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return Bytewords.lambda$encode$0(bArrAppendChecksum, i);
            }
        }).mapToObj(new IntFunction() { // from class: com.sparrowwallet.hummingbird.Bytewords$$ExternalSyntheticLambda8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return Bytewords.getByteword(i);
            }
        }).collect(Collectors.toList());
        StringJoiner stringJoiner = new StringJoiner(str);
        list.forEach(new Bytewords$$ExternalSyntheticLambda9(stringJoiner));
        return stringJoiner.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$encode$0(byte[] bArr, int i) {
        return bArr[i] & UnsignedBytes.MAX_VALUE;
    }

    private static String encodeMinimal(byte[] bArr) {
        final byte[] bArrAppendChecksum = appendChecksum(bArr);
        List list = (List) IntStream.range(0, bArrAppendChecksum.length).map(new IntUnaryOperator() { // from class: com.sparrowwallet.hummingbird.Bytewords$$ExternalSyntheticLambda10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return Bytewords.lambda$encodeMinimal$1(bArrAppendChecksum, i);
            }
        }).mapToObj(new IntFunction() { // from class: com.sparrowwallet.hummingbird.Bytewords$$ExternalSyntheticLambda11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return Bytewords.getMinimalByteword(i);
            }
        }).collect(Collectors.toList());
        final StringBuilder sb = new StringBuilder();
        list.forEach(new Consumer() { // from class: com.sparrowwallet.hummingbird.Bytewords$$ExternalSyntheticLambda12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                sb.append((String) obj);
            }
        });
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$encodeMinimal$1(byte[] bArr, int i) {
        return bArr[i] & UnsignedBytes.MAX_VALUE;
    }

    private static byte[] decode(String str, String str2) {
        return stripChecksum(toByteArray(Arrays.stream(str.split(str2)).mapToInt(new ToIntFunction() { // from class: com.sparrowwallet.hummingbird.Bytewords$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return Bytewords.lambda$decode$2((String) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$decode$2(String str) {
        return getBytewords().indexOf(str);
    }

    private static byte[] decodeMinimal(String str) {
        return stripChecksum(toByteArray(splitStringBySize(str, 2).stream().mapToInt(new ToIntFunction() { // from class: com.sparrowwallet.hummingbird.Bytewords$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return Bytewords.lambda$decodeMinimal$3((String) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$decodeMinimal$3(String str) {
        return getMinimalBytewords().indexOf(str);
    }

    private static byte[] appendChecksum(byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(crc32.getValue());
        byte[] bArr2 = new byte[bArr.length + 4];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(byteBufferAllocate.array(), 4, bArr2, bArr.length, 4);
        return bArr2;
    }

    private static byte[] stripChecksum(byte[] bArr) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - 4);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - 4, bArr.length);
        CRC32 crc32 = new CRC32();
        crc32.update(bArrCopyOfRange);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(crc32.getValue());
        if (Arrays.equals(Arrays.copyOfRange(byteBufferAllocate.array(), 4, 8), bArrCopyOfRange2)) {
            return bArrCopyOfRange;
        }
        throw new InvalidChecksumException("Invalid checksum");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getByteword(int i) {
        return bytewordsList.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getMinimalByteword(int i) {
        return minimalBytewordsList.get(i);
    }

    private static List<String> getBytewords() {
        return (List) IntStream.range(0, 256).mapToObj(new IntFunction() { // from class: com.sparrowwallet.hummingbird.Bytewords$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return Bytewords.lambda$getBytewords$4(i);
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getBytewords$4(int i) {
        int i2 = i * 4;
        return BYTEWORDS.substring(i2, i2 + 4);
    }

    private static List<String> getMinimalBytewords() {
        return (List) IntStream.range(0, 256).mapToObj(new IntFunction() { // from class: com.sparrowwallet.hummingbird.Bytewords$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return Bytewords.lambda$getMinimalBytewords$5(i);
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getMinimalBytewords$5(int i) {
        int i2 = i * 4;
        return Character.toString(BYTEWORDS.charAt(i2)) + BYTEWORDS.charAt(i2 + 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toByteArray$6(ByteArrayOutputStream byteArrayOutputStream, int i) {
        byteArrayOutputStream.write((byte) i);
    }

    public static byte[] toByteArray(IntStream intStream) {
        return ((ByteArrayOutputStream) intStream.collect(new Supplier() { // from class: com.sparrowwallet.hummingbird.Bytewords$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ByteArrayOutputStream();
            }
        }, new ObjIntConsumer() { // from class: com.sparrowwallet.hummingbird.Bytewords$$ExternalSyntheticLambda5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.ObjIntConsumer
            public final void accept(Object obj, int i) {
                Bytewords.lambda$toByteArray$6((ByteArrayOutputStream) obj, i);
            }
        }, new BiConsumer() { // from class: com.sparrowwallet.hummingbird.Bytewords$$ExternalSyntheticLambda6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Bytewords.lambda$toByteArray$7((ByteArrayOutputStream) obj, (ByteArrayOutputStream) obj2);
            }
        })).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toByteArray$7(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
        byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray(), 0, byteArrayOutputStream2.size());
    }

    private static List<String> splitStringBySize(String str, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str.length() / i) {
            int i3 = i2 + 1;
            arrayList.add(str.substring(i2 * i, Math.min(i3 * i, str.length())));
            i2 = i3;
        }
        return arrayList;
    }

    public static class InvalidChecksumException extends RuntimeException {
        public InvalidChecksumException(String str) {
            super(str);
        }
    }
}
