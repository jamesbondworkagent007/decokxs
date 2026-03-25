package org.spongycastle.pqc.math.ntru.polynomial;

import androidx.work.WorkRequest;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import org.spongycastle.pqc.math.ntru.euclid.BigIntEuclidean;
import org.spongycastle.pqc.math.ntru.util.ArrayEncoder;
import org.spongycastle.pqc.math.ntru.util.Util;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes25.dex */
public class IntegerPolynomial implements Polynomial {
    private static final List BIGINT_PRIMES;
    private static final int NUM_EQUAL_RESULTANTS = 3;
    private static final int[] PRIMES;
    public int[] coeffs;

    static {
        int[] iArr = new int[619];
        int[] iArr2 = new int[619];
        int i = 0;
        ByteBuffer.wrap("\u0000\u0000\u0011\u009b\u0000\u0000\u0011¡\u0000\u0000\u0011¥\u0000\u0000\u0011§\u0000\u0000\u0011«\u0000\u0000\u0011Ã\u0000\u0000\u0011Å\u0000\u0000\u0011Ñ\u0000\u0000\u0011×\u0000\u0000\u0011ç\u0000\u0000\u0011ï\u0000\u0000\u0011õ\u0000\u0000\u0011û\u0000\u0000\u0012\r\u0000\u0000\u0012\u001d\u0000\u0000\u0012\u001f\u0000\u0000\u0012#\u0000\u0000\u0012)\u0000\u0000\u0012+\u0000\u0000\u00121\u0000\u0000\u00127\u0000\u0000\u0012A\u0000\u0000\u0012G\u0000\u0000\u0012S\u0000\u0000\u0012_\u0000\u0000\u0012q\u0000\u0000\u0012s\u0000\u0000\u0012y\u0000\u0000\u0012}\u0000\u0000\u0012\u008f\u0000\u0000\u0012\u0097\u0000\u0000\u0012¯\u0000\u0000\u0012³\u0000\u0000\u0012µ\u0000\u0000\u0012¹\u0000\u0000\u0012¿\u0000\u0000\u0012Á\u0000\u0000\u0012Í\u0000\u0000\u0012Ñ\u0000\u0000\u0012ß\u0000\u0000\u0012ý\u0000\u0000\u0013\u0007\u0000\u0000\u0013\r\u0000\u0000\u0013\u0019\u0000\u0000\u0013'\u0000\u0000\u0013-\u0000\u0000\u00137\u0000\u0000\u0013C\u0000\u0000\u0013E\u0000\u0000\u0013I\u0000\u0000\u0013O\u0000\u0000\u0013W\u0000\u0000\u0013]\u0000\u0000\u0013g\u0000\u0000\u0013i\u0000\u0000\u0013m\u0000\u0000\u0013{\u0000\u0000\u0013\u0081\u0000\u0000\u0013\u0087\u0000\u0000\u0013\u008b\u0000\u0000\u0013\u0091\u0000\u0000\u0013\u0093\u0000\u0000\u0013\u009d\u0000\u0000\u0013\u009f\u0000\u0000\u0013¯\u0000\u0000\u0013»\u0000\u0000\u0013Ã\u0000\u0000\u0013Õ\u0000\u0000\u0013Ù\u0000\u0000\u0013ß\u0000\u0000\u0013ë\u0000\u0000\u0013í\u0000\u0000\u0013ó\u0000\u0000\u0013ù\u0000\u0000\u0013ÿ\u0000\u0000\u0014\u001b\u0000\u0000\u0014!\u0000\u0000\u0014/\u0000\u0000\u00143\u0000\u0000\u0014;\u0000\u0000\u0014E\u0000\u0000\u0014M\u0000\u0000\u0014Y\u0000\u0000\u0014k\u0000\u0000\u0014o\u0000\u0000\u0014q\u0000\u0000\u0014u\u0000\u0000\u0014\u008d\u0000\u0000\u0014\u0099\u0000\u0000\u0014\u009f\u0000\u0000\u0014¡\u0000\u0000\u0014±\u0000\u0000\u0014·\u0000\u0000\u0014½\u0000\u0000\u0014Ë\u0000\u0000\u0014Õ\u0000\u0000\u0014ã\u0000\u0000\u0014ç\u0000\u0000\u0015\u0005\u0000\u0000\u0015\u000b\u0000\u0000\u0015\u0011\u0000\u0000\u0015\u0017\u0000\u0000\u0015\u001f\u0000\u0000\u0015%\u0000\u0000\u0015)\u0000\u0000\u0015+\u0000\u0000\u00157\u0000\u0000\u0015=\u0000\u0000\u0015A\u0000\u0000\u0015C\u0000\u0000\u0015I\u0000\u0000\u0015_\u0000\u0000\u0015e\u0000\u0000\u0015g\u0000\u0000\u0015k\u0000\u0000\u0015}\u0000\u0000\u0015\u007f\u0000\u0000\u0015\u0083\u0000\u0000\u0015\u008f\u0000\u0000\u0015\u0091\u0000\u0000\u0015\u0097\u0000\u0000\u0015\u009b\u0000\u0000\u0015µ\u0000\u0000\u0015»\u0000\u0000\u0015Á\u0000\u0000\u0015Å\u0000\u0000\u0015Í\u0000\u0000\u0015×\u0000\u0000\u0015÷\u0000\u0000\u0016\u0007\u0000\u0000\u0016\t\u0000\u0000\u0016\u000f\u0000\u0000\u0016\u0013\u0000\u0000\u0016\u0015\u0000\u0000\u0016\u0019\u0000\u0000\u0016\u001b\u0000\u0000\u0016%\u0000\u0000\u00163\u0000\u0000\u00169\u0000\u0000\u0016=\u0000\u0000\u0016E\u0000\u0000\u0016O\u0000\u0000\u0016U\u0000\u0000\u0016i\u0000\u0000\u0016m\u0000\u0000\u0016o\u0000\u0000\u0016u\u0000\u0000\u0016\u0093\u0000\u0000\u0016\u0097\u0000\u0000\u0016\u009f\u0000\u0000\u0016©\u0000\u0000\u0016¯\u0000\u0000\u0016µ\u0000\u0000\u0016½\u0000\u0000\u0016Ã\u0000\u0000\u0016Ï\u0000\u0000\u0016Ó\u0000\u0000\u0016Ù\u0000\u0000\u0016Û\u0000\u0000\u0016á\u0000\u0000\u0016å\u0000\u0000\u0016ë\u0000\u0000\u0016í\u0000\u0000\u0016÷\u0000\u0000\u0016ù\u0000\u0000\u0017\t\u0000\u0000\u0017\u000f\u0000\u0000\u0017#\u0000\u0000\u0017'\u0000\u0000\u00173\u0000\u0000\u0017A\u0000\u0000\u0017]\u0000\u0000\u0017c\u0000\u0000\u0017w\u0000\u0000\u0017{\u0000\u0000\u0017\u008d\u0000\u0000\u0017\u0095\u0000\u0000\u0017\u009b\u0000\u0000\u0017\u009f\u0000\u0000\u0017¥\u0000\u0000\u0017³\u0000\u0000\u0017¹\u0000\u0000\u0017¿\u0000\u0000\u0017É\u0000\u0000\u0017Ë\u0000\u0000\u0017Õ\u0000\u0000\u0017á\u0000\u0000\u0017é\u0000\u0000\u0017ó\u0000\u0000\u0017õ\u0000\u0000\u0017ÿ\u0000\u0000\u0018\u0007\u0000\u0000\u0018\u0013\u0000\u0000\u0018\u001d\u0000\u0000\u00185\u0000\u0000\u00187\u0000\u0000\u0018;\u0000\u0000\u0018C\u0000\u0000\u0018I\u0000\u0000\u0018M\u0000\u0000\u0018U\u0000\u0000\u0018g\u0000\u0000\u0018q\u0000\u0000\u0018w\u0000\u0000\u0018}\u0000\u0000\u0018\u007f\u0000\u0000\u0018\u0085\u0000\u0000\u0018\u008f\u0000\u0000\u0018\u009b\u0000\u0000\u0018\u009d\u0000\u0000\u0018§\u0000\u0000\u0018\u00ad\u0000\u0000\u0018³\u0000\u0000\u0018¹\u0000\u0000\u0018Á\u0000\u0000\u0018Ç\u0000\u0000\u0018Ñ\u0000\u0000\u0018×\u0000\u0000\u0018Ù\u0000\u0000\u0018ß\u0000\u0000\u0018å\u0000\u0000\u0018ë\u0000\u0000\u0018õ\u0000\u0000\u0018ý\u0000\u0000\u0019\u0015\u0000\u0000\u0019\u001b\u0000\u0000\u00191\u0000\u0000\u00193\u0000\u0000\u0019E\u0000\u0000\u0019I\u0000\u0000\u0019Q\u0000\u0000\u0019[\u0000\u0000\u0019y\u0000\u0000\u0019\u0081\u0000\u0000\u0019\u0093\u0000\u0000\u0019\u0097\u0000\u0000\u0019\u0099\u0000\u0000\u0019£\u0000\u0000\u0019©\u0000\u0000\u0019«\u0000\u0000\u0019±\u0000\u0000\u0019µ\u0000\u0000\u0019Ç\u0000\u0000\u0019Ï\u0000\u0000\u0019Û\u0000\u0000\u0019í\u0000\u0000\u0019ý\u0000\u0000\u001a\u0003\u0000\u0000\u001a\u0005\u0000\u0000\u001a\u0011\u0000\u0000\u001a\u0017\u0000\u0000\u001a!\u0000\u0000\u001a#\u0000\u0000\u001a-\u0000\u0000\u001a/\u0000\u0000\u001a5\u0000\u0000\u001a?\u0000\u0000\u001aM\u0000\u0000\u001aQ\u0000\u0000\u001ai\u0000\u0000\u001ak\u0000\u0000\u001a{\u0000\u0000\u001a}\u0000\u0000\u001a\u0087\u0000\u0000\u001a\u0089\u0000\u0000\u001a\u0093\u0000\u0000\u001a§\u0000\u0000\u001a«\u0000\u0000\u001a\u00ad\u0000\u0000\u001a±\u0000\u0000\u001a¹\u0000\u0000\u001aÉ\u0000\u0000\u001aÏ\u0000\u0000\u001aÕ\u0000\u0000\u001a×\u0000\u0000\u001aã\u0000\u0000\u001aó\u0000\u0000\u001aû\u0000\u0000\u001aÿ\u0000\u0000\u001b\u0005\u0000\u0000\u001b#\u0000\u0000\u001b%\u0000\u0000\u001b/\u0000\u0000\u001b1\u0000\u0000\u001b7\u0000\u0000\u001b;\u0000\u0000\u001bA\u0000\u0000\u001bG\u0000\u0000\u001bO\u0000\u0000\u001bU\u0000\u0000\u001bY\u0000\u0000\u001be\u0000\u0000\u001bk\u0000\u0000\u001bs\u0000\u0000\u001b\u007f\u0000\u0000\u001b\u0083\u0000\u0000\u001b\u0091\u0000\u0000\u001b\u009d\u0000\u0000\u001b§\u0000\u0000\u001b¿\u0000\u0000\u001bÅ\u0000\u0000\u001bÑ\u0000\u0000\u001b×\u0000\u0000\u001bÙ\u0000\u0000\u001bï\u0000\u0000\u001b÷\u0000\u0000\u001c\t\u0000\u0000\u001c\u0013\u0000\u0000\u001c\u0019\u0000\u0000\u001c'\u0000\u0000\u001c+\u0000\u0000\u001c-\u0000\u0000\u001c3\u0000\u0000\u001c=\u0000\u0000\u001cE\u0000\u0000\u001cK\u0000\u0000\u001cO\u0000\u0000\u001cU\u0000\u0000\u001cs\u0000\u0000\u001c\u0081\u0000\u0000\u001c\u008b\u0000\u0000\u001c\u008d\u0000\u0000\u001c\u0099\u0000\u0000\u001c£\u0000\u0000\u001c¥\u0000\u0000\u001cµ\u0000\u0000\u001c·\u0000\u0000\u001cÉ\u0000\u0000\u001cá\u0000\u0000\u001có\u0000\u0000\u001cù\u0000\u0000\u001d\t\u0000\u0000\u001d\u001b\u0000\u0000\u001d!\u0000\u0000\u001d#\u0000\u0000\u001d5\u0000\u0000\u001d9\u0000\u0000\u001d?\u0000\u0000\u001dA\u0000\u0000\u001dK\u0000\u0000\u001dS\u0000\u0000\u001d]\u0000\u0000\u001dc\u0000\u0000\u001di\u0000\u0000\u001dq\u0000\u0000\u001du\u0000\u0000\u001d{\u0000\u0000\u001d}\u0000\u0000\u001d\u0087\u0000\u0000\u001d\u0089\u0000\u0000\u001d\u0095\u0000\u0000\u001d\u0099\u0000\u0000\u001d\u009f\u0000\u0000\u001d¥\u0000\u0000\u001d§\u0000\u0000\u001d³\u0000\u0000\u001d·\u0000\u0000\u001dÅ\u0000\u0000\u001d×\u0000\u0000\u001dÛ\u0000\u0000\u001dá\u0000\u0000\u001dõ\u0000\u0000\u001dù\u0000\u0000\u001e\u0001\u0000\u0000\u001e\u0007\u0000\u0000\u001e\u000b\u0000\u0000\u001e\u0013\u0000\u0000\u001e\u0017\u0000\u0000\u001e%\u0000\u0000\u001e+\u0000\u0000\u001e/\u0000\u0000\u001e=\u0000\u0000\u001eI\u0000\u0000\u001eM\u0000\u0000\u001eO\u0000\u0000\u001em\u0000\u0000\u001eq\u0000\u0000\u001e\u0089\u0000\u0000\u001e\u008f\u0000\u0000\u001e\u0095\u0000\u0000\u001e¡\u0000\u0000\u001e\u00ad\u0000\u0000\u001e»\u0000\u0000\u001eÁ\u0000\u0000\u001eÅ\u0000\u0000\u001eÇ\u0000\u0000\u001eË\u0000\u0000\u001eÝ\u0000\u0000\u001eã\u0000\u0000\u001eï\u0000\u0000\u001e÷\u0000\u0000\u001eý\u0000\u0000\u001f\u0001\u0000\u0000\u001f\r\u0000\u0000\u001f\u000f\u0000\u0000\u001f\u001b\u0000\u0000\u001f9\u0000\u0000\u001fI\u0000\u0000\u001fK\u0000\u0000\u001fQ\u0000\u0000\u001fg\u0000\u0000\u001fu\u0000\u0000\u001f{\u0000\u0000\u001f\u0085\u0000\u0000\u001f\u0091\u0000\u0000\u001f\u0097\u0000\u0000\u001f\u0099\u0000\u0000\u001f\u009d\u0000\u0000\u001f¥\u0000\u0000\u001f¯\u0000\u0000\u001fµ\u0000\u0000\u001f»\u0000\u0000\u001fÓ\u0000\u0000\u001fá\u0000\u0000\u001fç\u0000\u0000\u001fë\u0000\u0000\u001fó\u0000\u0000\u001fÿ\u0000\u0000 \u0011\u0000\u0000 \u001b\u0000\u0000 \u001d\u0000\u0000 '\u0000\u0000 )\u0000\u0000 -\u0000\u0000 3\u0000\u0000 G\u0000\u0000 M\u0000\u0000 Q\u0000\u0000 _\u0000\u0000 c\u0000\u0000 e\u0000\u0000 i\u0000\u0000 w\u0000\u0000 }\u0000\u0000 \u0089\u0000\u0000 ¡\u0000\u0000 «\u0000\u0000 ±\u0000\u0000 ¹\u0000\u0000 Ã\u0000\u0000 Å\u0000\u0000 ã\u0000\u0000 ç\u0000\u0000 í\u0000\u0000 ï\u0000\u0000 û\u0000\u0000 ÿ\u0000\u0000!\r\u0000\u0000!\u0013\u0000\u0000!5\u0000\u0000!A\u0000\u0000!I\u0000\u0000!O\u0000\u0000!Y\u0000\u0000![\u0000\u0000!_\u0000\u0000!s\u0000\u0000!}\u0000\u0000!\u0085\u0000\u0000!\u0095\u0000\u0000!\u0097\u0000\u0000!¡\u0000\u0000!¯\u0000\u0000!³\u0000\u0000!µ\u0000\u0000!Á\u0000\u0000!Ç\u0000\u0000!×\u0000\u0000!Ý\u0000\u0000!å\u0000\u0000!é\u0000\u0000!ñ\u0000\u0000!õ\u0000\u0000!û\u0000\u0000\"\u0003\u0000\u0000\"\t\u0000\u0000\"\u000f\u0000\u0000\"\u001b\u0000\u0000\"!\u0000\u0000\"%\u0000\u0000\"+\u0000\u0000\"1\u0000\u0000\"9\u0000\u0000\"K\u0000\u0000\"O\u0000\u0000\"c\u0000\u0000\"g\u0000\u0000\"s\u0000\u0000\"u\u0000\u0000\"\u007f\u0000\u0000\"\u0085\u0000\u0000\"\u0087\u0000\u0000\"\u0091\u0000\u0000\"\u009d\u0000\u0000\"\u009f\u0000\u0000\"£\u0000\u0000\"·\u0000\u0000\"½\u0000\u0000\"Û\u0000\u0000\"á\u0000\u0000\"å\u0000\u0000\"í\u0000\u0000\"÷\u0000\u0000#\u0003\u0000\u0000#\t\u0000\u0000#\u000b\u0000\u0000#'\u0000\u0000#)\u0000\u0000#/\u0000\u0000#3\u0000\u0000#5\u0000\u0000#E\u0000\u0000#Q\u0000\u0000#S\u0000\u0000#Y\u0000\u0000#c\u0000\u0000#k\u0000\u0000#\u0083\u0000\u0000#\u008f\u0000\u0000#\u0095\u0000\u0000#§\u0000\u0000#\u00ad\u0000\u0000#±\u0000\u0000#¿\u0000\u0000#Å\u0000\u0000#É\u0000\u0000#Õ\u0000\u0000#Ý\u0000\u0000#ã\u0000\u0000#ï\u0000\u0000#ó\u0000\u0000#ù\u0000\u0000$\u0005\u0000\u0000$\u000b\u0000\u0000$\u0017\u0000\u0000$\u0019\u0000\u0000$)\u0000\u0000$=\u0000\u0000$A\u0000\u0000$C\u0000\u0000$M\u0000\u0000$_\u0000\u0000$g\u0000\u0000$k\u0000\u0000$y\u0000\u0000$}\u0000\u0000$\u007f\u0000\u0000$\u0085\u0000\u0000$\u009b\u0000\u0000$¡\u0000\u0000$¯\u0000\u0000$µ\u0000\u0000$»\u0000\u0000$Å\u0000\u0000$Ë\u0000\u0000$Í\u0000\u0000$×\u0000\u0000$Ù\u0000\u0000$Ý\u0000\u0000$ß\u0000\u0000$õ\u0000\u0000$÷\u0000\u0000$û\u0000\u0000%\u0001\u0000\u0000%\u0007\u0000\u0000%\u0013\u0000\u0000%\u0019\u0000\u0000%'\u0000\u0000%1\u0000\u0000%=\u0000\u0000%C\u0000\u0000%K\u0000\u0000%O\u0000\u0000%s\u0000\u0000%\u0081\u0000\u0000%\u008d\u0000\u0000%\u0093\u0000\u0000%\u0097\u0000\u0000%\u009d\u0000\u0000%\u009f\u0000\u0000%«\u0000\u0000%±\u0000\u0000%½\u0000\u0000%Í\u0000\u0000%Ï\u0000\u0000%Ù\u0000\u0000%á\u0000\u0000%÷\u0000\u0000%ù\u0000\u0000&\u0005\u0000\u0000&\u000b\u0000\u0000&\u000f\u0000\u0000&\u0015\u0000\u0000&'\u0000\u0000&)\u0000\u0000&5\u0000\u0000&;\u0000\u0000&?\u0000\u0000&K\u0000\u0000&S\u0000\u0000&Y\u0000\u0000&e\u0000\u0000&i\u0000\u0000&o\u0000\u0000&{\u0000\u0000&\u0081\u0000\u0000&\u0083\u0000\u0000&\u008f\u0000\u0000&\u009b\u0000\u0000&\u009f\u0000\u0000&\u00ad\u0000\u0000&³\u0000\u0000&Ã\u0000\u0000&É\u0000\u0000&Ë\u0000\u0000&Õ\u0000\u0000&Ý\u0000\u0000&ï\u0000\u0000&õ".getBytes("ISO-8859-1")).asIntBuffer().get(iArr2, 0, 619);
        System.arraycopy(iArr2, 0, iArr, 0, 619);
        PRIMES = iArr;
        BIGINT_PRIMES = new ArrayList();
        while (true) {
            if (i == PRIMES.length) {
                return;
            }
            BIGINT_PRIMES.add(BigInteger.valueOf(r0[i]));
            i++;
        }
    }

    public IntegerPolynomial(int i) {
        this.coeffs = new int[i];
    }

    public IntegerPolynomial(int[] iArr) {
        this.coeffs = iArr;
    }

    public IntegerPolynomial(BigIntPolynomial bigIntPolynomial) {
        this.coeffs = new int[bigIntPolynomial.coeffs.length];
        int i = 0;
        while (true) {
            BigInteger[] bigIntegerArr = bigIntPolynomial.coeffs;
            if (i >= bigIntegerArr.length) {
                return;
            }
            this.coeffs[i] = bigIntegerArr[i].intValue();
            i++;
        }
    }

    public static IntegerPolynomial fromBinary3Sves(byte[] bArr, int i) {
        return new IntegerPolynomial(ArrayEncoder.decodeMod3Sves(bArr, i));
    }

    public static IntegerPolynomial fromBinary3Tight(byte[] bArr, int i) {
        return new IntegerPolynomial(ArrayEncoder.decodeMod3Tight(bArr, i));
    }

    public static IntegerPolynomial fromBinary3Tight(InputStream inputStream, int i) throws IOException {
        return new IntegerPolynomial(ArrayEncoder.decodeMod3Tight(inputStream, i));
    }

    public static IntegerPolynomial fromBinary(byte[] bArr, int i, int i2) {
        return new IntegerPolynomial(ArrayEncoder.decodeModQ(bArr, i, i2));
    }

    public static IntegerPolynomial fromBinary(InputStream inputStream, int i, int i2) throws IOException {
        return new IntegerPolynomial(ArrayEncoder.decodeModQ(inputStream, i, i2));
    }

    public byte[] toBinary3Sves() {
        return ArrayEncoder.encodeMod3Sves(this.coeffs);
    }

    public byte[] toBinary3Tight() {
        BigInteger bigIntegerAdd = Constants.BIGINT_ZERO;
        for (int length = this.coeffs.length - 1; length >= 0; length--) {
            bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.valueOf(3L)).add(BigInteger.valueOf(this.coeffs[length] + 1));
        }
        int iBitLength = (BigInteger.valueOf(3L).pow(this.coeffs.length).bitLength() + 7) / 8;
        byte[] byteArray = bigIntegerAdd.toByteArray();
        if (byteArray.length >= iBitLength) {
            return byteArray.length > iBitLength ? Arrays.copyOfRange(byteArray, 1, byteArray.length) : byteArray;
        }
        byte[] bArr = new byte[iBitLength];
        System.arraycopy(byteArray, 0, bArr, iBitLength - byteArray.length, byteArray.length);
        return bArr;
    }

    public byte[] toBinary(int i) {
        return ArrayEncoder.encodeModQ(this.coeffs, i);
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial, int i) {
        IntegerPolynomial integerPolynomialMult = mult(integerPolynomial);
        integerPolynomialMult.mod(i);
        return integerPolynomialMult;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial) {
        int[] iArr;
        int length = this.coeffs.length;
        if (integerPolynomial.coeffs.length != length) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        IntegerPolynomial integerPolynomialMultRecursive = multRecursive(integerPolynomial);
        if (integerPolynomialMultRecursive.coeffs.length > length) {
            int i = length;
            while (true) {
                iArr = integerPolynomialMultRecursive.coeffs;
                if (i >= iArr.length) {
                    break;
                }
                int i2 = i - length;
                iArr[i2] = iArr[i2] + iArr[i];
                i++;
            }
            integerPolynomialMultRecursive.coeffs = Arrays.copyOf(iArr, length);
        }
        return integerPolynomialMultRecursive;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public BigIntPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        return new BigIntPolynomial(this).mult(bigIntPolynomial);
    }

    private IntegerPolynomial multRecursive(IntegerPolynomial integerPolynomial) {
        int[] iArr = this.coeffs;
        int[] iArr2 = integerPolynomial.coeffs;
        int length = iArr2.length;
        int i = 0;
        if (length <= 32) {
            int i2 = (length * 2) - 1;
            IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(new int[i2]);
            for (int i3 = 0; i3 < i2; i3++) {
                for (int iMax = Math.max(0, (i3 - length) + 1); iMax <= Math.min(i3, length - 1); iMax++) {
                    int[] iArr3 = integerPolynomial2.coeffs;
                    iArr3[i3] = iArr3[i3] + (iArr2[iMax] * iArr[i3 - iMax]);
                }
            }
            return integerPolynomial2;
        }
        int i4 = length / 2;
        IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(Arrays.copyOf(iArr, i4));
        IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(Arrays.copyOfRange(iArr, i4, length));
        IntegerPolynomial integerPolynomial5 = new IntegerPolynomial(Arrays.copyOf(iArr2, i4));
        IntegerPolynomial integerPolynomial6 = new IntegerPolynomial(Arrays.copyOfRange(iArr2, i4, length));
        IntegerPolynomial integerPolynomial7 = (IntegerPolynomial) integerPolynomial3.clone();
        integerPolynomial7.add(integerPolynomial4);
        IntegerPolynomial integerPolynomial8 = (IntegerPolynomial) integerPolynomial5.clone();
        integerPolynomial8.add(integerPolynomial6);
        IntegerPolynomial integerPolynomialMultRecursive = integerPolynomial3.multRecursive(integerPolynomial5);
        IntegerPolynomial integerPolynomialMultRecursive2 = integerPolynomial4.multRecursive(integerPolynomial6);
        IntegerPolynomial integerPolynomialMultRecursive3 = integerPolynomial7.multRecursive(integerPolynomial8);
        integerPolynomialMultRecursive3.sub(integerPolynomialMultRecursive);
        integerPolynomialMultRecursive3.sub(integerPolynomialMultRecursive2);
        IntegerPolynomial integerPolynomial9 = new IntegerPolynomial((length * 2) - 1);
        int i5 = 0;
        while (true) {
            int[] iArr4 = integerPolynomialMultRecursive.coeffs;
            if (i5 >= iArr4.length) {
                break;
            }
            integerPolynomial9.coeffs[i5] = iArr4[i5];
            i5++;
        }
        int i6 = 0;
        while (true) {
            int[] iArr5 = integerPolynomialMultRecursive3.coeffs;
            if (i6 >= iArr5.length) {
                break;
            }
            int[] iArr6 = integerPolynomial9.coeffs;
            int i7 = i4 + i6;
            iArr6[i7] = iArr6[i7] + iArr5[i6];
            i6++;
        }
        while (true) {
            int[] iArr7 = integerPolynomialMultRecursive2.coeffs;
            if (i >= iArr7.length) {
                return integerPolynomial9;
            }
            int[] iArr8 = integerPolynomial9.coeffs;
            int i8 = (i4 * 2) + i;
            iArr8[i8] = iArr8[i8] + iArr7[i];
            i++;
        }
    }

    public IntegerPolynomial invertFq(int i) {
        int length = this.coeffs.length;
        int i2 = length + 1;
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i2);
        integerPolynomial.coeffs[0] = 1;
        IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(i2);
        IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(i2);
        integerPolynomial3.coeffs = Arrays.copyOf(this.coeffs, i2);
        integerPolynomial3.modPositive(2);
        IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(i2);
        int[] iArr = integerPolynomial4.coeffs;
        iArr[0] = 1;
        iArr[length] = 1;
        int i3 = 0;
        while (true) {
            if (integerPolynomial3.coeffs[0] == 0) {
                for (int i4 = 1; i4 <= length; i4++) {
                    int[] iArr2 = integerPolynomial3.coeffs;
                    iArr2[i4 - 1] = iArr2[i4];
                    int[] iArr3 = integerPolynomial2.coeffs;
                    iArr3[i2 - i4] = iArr3[length - i4];
                }
                integerPolynomial3.coeffs[length] = 0;
                integerPolynomial2.coeffs[0] = 0;
                i3++;
                if (integerPolynomial3.equalsZero()) {
                    return null;
                }
            } else if (!integerPolynomial3.equalsOne()) {
                if (integerPolynomial3.degree() < integerPolynomial4.degree()) {
                    IntegerPolynomial integerPolynomial5 = integerPolynomial2;
                    integerPolynomial2 = integerPolynomial;
                    integerPolynomial = integerPolynomial5;
                    IntegerPolynomial integerPolynomial6 = integerPolynomial4;
                    integerPolynomial4 = integerPolynomial3;
                    integerPolynomial3 = integerPolynomial6;
                }
                integerPolynomial3.add(integerPolynomial4, 2);
                integerPolynomial.add(integerPolynomial2, 2);
            } else {
                if (integerPolynomial.coeffs[length] != 0) {
                    return null;
                }
                IntegerPolynomial integerPolynomial7 = new IntegerPolynomial(length);
                for (int i5 = length - 1; i5 >= 0; i5--) {
                    int i6 = i5 - (i3 % length);
                    if (i6 < 0) {
                        i6 += length;
                    }
                    integerPolynomial7.coeffs[i6] = integerPolynomial.coeffs[i5];
                }
                return mod2ToModq(integerPolynomial7, i);
            }
        }
    }

    private IntegerPolynomial mod2ToModq(IntegerPolynomial integerPolynomial, int i) {
        int i2 = 2;
        if (!Util.is64BitJVM() || i != 2048) {
            while (i2 < i) {
                i2 *= 2;
                int[] iArr = integerPolynomial.coeffs;
                IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(Arrays.copyOf(iArr, iArr.length));
                integerPolynomial2.mult2(i2);
                integerPolynomial2.sub(mult(integerPolynomial, i2).mult(integerPolynomial, i2), i2);
                integerPolynomial = integerPolynomial2;
            }
            return integerPolynomial;
        }
        LongPolynomial2 longPolynomial2 = new LongPolynomial2(this);
        LongPolynomial2 longPolynomial22 = new LongPolynomial2(integerPolynomial);
        while (i2 < i) {
            i2 *= 2;
            LongPolynomial2 longPolynomial23 = (LongPolynomial2) longPolynomial22.clone();
            int i3 = i2 - 1;
            longPolynomial23.mult2And(i3);
            longPolynomial23.subAnd(longPolynomial2.mult(longPolynomial22).mult(longPolynomial22), i3);
            longPolynomial22 = longPolynomial23;
        }
        return longPolynomial22.toIntegerPolynomial();
    }

    public IntegerPolynomial invertF3() {
        int length = this.coeffs.length;
        int i = length + 1;
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i);
        integerPolynomial.coeffs[0] = 1;
        IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(i);
        IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(i);
        integerPolynomial3.coeffs = Arrays.copyOf(this.coeffs, i);
        integerPolynomial3.modPositive(3);
        IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(i);
        int[] iArr = integerPolynomial4.coeffs;
        iArr[0] = -1;
        iArr[length] = 1;
        int i2 = 0;
        while (true) {
            if (integerPolynomial3.coeffs[0] == 0) {
                for (int i3 = 1; i3 <= length; i3++) {
                    int[] iArr2 = integerPolynomial3.coeffs;
                    iArr2[i3 - 1] = iArr2[i3];
                    int[] iArr3 = integerPolynomial2.coeffs;
                    iArr3[i - i3] = iArr3[length - i3];
                }
                integerPolynomial3.coeffs[length] = 0;
                integerPolynomial2.coeffs[0] = 0;
                i2++;
                if (integerPolynomial3.equalsZero()) {
                    return null;
                }
            } else if (!integerPolynomial3.equalsAbsOne()) {
                if (integerPolynomial3.degree() < integerPolynomial4.degree()) {
                    IntegerPolynomial integerPolynomial5 = integerPolynomial2;
                    integerPolynomial2 = integerPolynomial;
                    integerPolynomial = integerPolynomial5;
                    IntegerPolynomial integerPolynomial6 = integerPolynomial4;
                    integerPolynomial4 = integerPolynomial3;
                    integerPolynomial3 = integerPolynomial6;
                }
                if (integerPolynomial3.coeffs[0] == integerPolynomial4.coeffs[0]) {
                    integerPolynomial3.sub(integerPolynomial4, 3);
                    integerPolynomial.sub(integerPolynomial2, 3);
                } else {
                    integerPolynomial3.add(integerPolynomial4, 3);
                    integerPolynomial.add(integerPolynomial2, 3);
                }
            } else {
                if (integerPolynomial.coeffs[length] != 0) {
                    return null;
                }
                IntegerPolynomial integerPolynomial7 = new IntegerPolynomial(length);
                for (int i4 = length - 1; i4 >= 0; i4--) {
                    int i5 = i4 - (i2 % length);
                    if (i5 < 0) {
                        i5 += length;
                    }
                    integerPolynomial7.coeffs[i5] = integerPolynomial3.coeffs[0] * integerPolynomial.coeffs[i4];
                }
                integerPolynomial7.ensurePositive(3);
                return integerPolynomial7;
            }
        }
    }

    public Resultant resultant() {
        BigInteger bigIntegerMultiply;
        BigInteger bigIntegerAdd;
        int length = this.coeffs.length;
        LinkedList linkedList = new LinkedList();
        BigInteger bigInteger = Constants.BIGINT_ONE;
        PrimeGenerator primeGenerator = new PrimeGenerator();
        BigInteger bigInteger2 = bigInteger;
        int i = 1;
        while (true) {
            BigInteger bigIntegerNextPrime = primeGenerator.nextPrime();
            ModularResultant modularResultantResultant = resultant(bigIntegerNextPrime.intValue());
            linkedList.add(modularResultantResultant);
            bigIntegerMultiply = bigInteger.multiply(bigIntegerNextPrime);
            BigIntEuclidean bigIntEuclideanCalculate = BigIntEuclidean.calculate(bigIntegerNextPrime, bigInteger);
            BigInteger bigIntegerMod = bigInteger2.multiply(bigIntEuclideanCalculate.x.multiply(bigIntegerNextPrime)).add(modularResultantResultant.res.multiply(bigIntEuclideanCalculate.y.multiply(bigInteger))).mod(bigIntegerMultiply);
            BigInteger bigIntegerDivide = bigIntegerMultiply.divide(BigInteger.valueOf(2L));
            BigInteger bigIntegerNegate = bigIntegerDivide.negate();
            if (bigIntegerMod.compareTo(bigIntegerDivide) > 0) {
                bigIntegerAdd = bigIntegerMod.subtract(bigIntegerMultiply);
            } else {
                int iCompareTo = bigIntegerMod.compareTo(bigIntegerNegate);
                bigIntegerAdd = bigIntegerMod;
                if (iCompareTo < 0) {
                    bigIntegerAdd = bigIntegerMod.add(bigIntegerMultiply);
                }
            }
            if (bigIntegerAdd.equals(bigInteger2)) {
                i++;
                if (i >= 3) {
                    break;
                }
            } else {
                i = 1;
            }
            bigInteger2 = bigIntegerAdd;
            bigInteger = bigIntegerMultiply;
        }
        while (linkedList.size() > 1) {
            linkedList.addLast(ModularResultant.combineRho((ModularResultant) linkedList.removeFirst(), (ModularResultant) linkedList.removeFirst()));
        }
        BigIntPolynomial bigIntPolynomial = ((ModularResultant) linkedList.getFirst()).rho;
        BigInteger bigIntegerDivide2 = bigIntegerMultiply.divide(BigInteger.valueOf(2L));
        BigInteger bigIntegerNegate2 = bigIntegerDivide2.negate();
        int iCompareTo2 = bigIntegerAdd.compareTo(bigIntegerDivide2);
        BigInteger bigIntegerSubtract = bigIntegerAdd;
        if (iCompareTo2 > 0) {
            bigIntegerSubtract = bigIntegerAdd.subtract(bigIntegerMultiply);
        }
        int iCompareTo3 = bigIntegerSubtract.compareTo(bigIntegerNegate2);
        BigInteger bigIntegerAdd2 = bigIntegerSubtract;
        if (iCompareTo3 < 0) {
            bigIntegerAdd2 = bigIntegerSubtract.add(bigIntegerMultiply);
        }
        for (int i2 = 0; i2 < length; i2++) {
            BigInteger bigInteger3 = bigIntPolynomial.coeffs[i2];
            if (bigInteger3.compareTo(bigIntegerDivide2) > 0) {
                bigIntPolynomial.coeffs[i2] = bigInteger3.subtract(bigIntegerMultiply);
            }
            if (bigInteger3.compareTo(bigIntegerNegate2) < 0) {
                bigIntPolynomial.coeffs[i2] = bigInteger3.add(bigIntegerMultiply);
            }
        }
        return new Resultant(bigIntPolynomial, bigIntegerAdd2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        r10 = (org.spongycastle.pqc.math.ntru.polynomial.ModularResultant) r1.get();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Resultant resultantMultiThread() {
        ModularResultant modularResultant;
        byte b;
        int length = this.coeffs.length;
        BigInteger bigIntegerMultiply = squareSum().pow((length + 1) / 2).multiply(BigInteger.valueOf(2L).pow((degree() + 1) / 2)).multiply(BigInteger.valueOf(2L));
        BigInteger bigIntegerValueOf = BigInteger.valueOf(WorkRequest.MIN_BACKOFF_MILLIS);
        BigInteger bigIntegerMultiply2 = Constants.BIGINT_ONE;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Iterator it = BIGINT_PRIMES.iterator();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        while (true) {
            modularResultant = null;
            b = 0;
            byte b2 = 0;
            if (bigIntegerMultiply2.compareTo(bigIntegerMultiply) >= 0) {
                break;
            }
            if (it.hasNext()) {
                bigIntegerValueOf = (BigInteger) it.next();
            } else {
                bigIntegerValueOf = bigIntegerValueOf.nextProbablePrime();
            }
            linkedBlockingQueue.add(executorServiceNewFixedThreadPool.submit(new ModResultantTask(bigIntegerValueOf.intValue())));
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply(bigIntegerValueOf);
        }
        while (true) {
            if (linkedBlockingQueue.isEmpty()) {
                break;
            }
            try {
                Future future = (Future) linkedBlockingQueue.take();
                Future future2 = (Future) linkedBlockingQueue.poll();
                if (future2 == null) {
                    break;
                }
                linkedBlockingQueue.add(executorServiceNewFixedThreadPool.submit(new CombineTask((ModularResultant) future.get(), (ModularResultant) future2.get())));
            } catch (Exception e) {
                throw new IllegalStateException(e.toString());
            }
        }
        executorServiceNewFixedThreadPool.shutdown();
        BigInteger bigIntegerAdd = modularResultant.res;
        BigIntPolynomial bigIntPolynomial = modularResultant.rho;
        BigInteger bigIntegerDivide = bigIntegerMultiply2.divide(BigInteger.valueOf(2L));
        BigInteger bigIntegerNegate = bigIntegerDivide.negate();
        if (bigIntegerAdd.compareTo(bigIntegerDivide) > 0) {
            bigIntegerAdd = bigIntegerAdd.subtract(bigIntegerMultiply2);
        }
        if (bigIntegerAdd.compareTo(bigIntegerNegate) < 0) {
            bigIntegerAdd = bigIntegerAdd.add(bigIntegerMultiply2);
        }
        for (int i = 0; i < length; i++) {
            BigInteger bigInteger = bigIntPolynomial.coeffs[i];
            if (bigInteger.compareTo(bigIntegerDivide) > 0) {
                bigIntPolynomial.coeffs[i] = bigInteger.subtract(bigIntegerMultiply2);
            }
            if (bigInteger.compareTo(bigIntegerNegate) < 0) {
                bigIntPolynomial.coeffs[i] = bigInteger.add(bigIntegerMultiply2);
            }
        }
        return new Resultant(bigIntPolynomial, bigIntegerAdd);
    }

    public ModularResultant resultant(int i) {
        int[] iArr = this.coeffs;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(iArrCopyOf);
        int length = iArrCopyOf.length;
        IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(length);
        int[] iArr2 = integerPolynomial2.coeffs;
        iArr2[0] = -1;
        int i2 = length - 1;
        iArr2[i2] = 1;
        IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(integerPolynomial.coeffs);
        IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(length);
        IntegerPolynomial integerPolynomial5 = new IntegerPolynomial(length);
        integerPolynomial5.coeffs[0] = 1;
        int iPow = 1;
        int i3 = i2;
        int iDegree = integerPolynomial3.degree();
        IntegerPolynomial integerPolynomial6 = integerPolynomial4;
        IntegerPolynomial integerPolynomial7 = integerPolynomial5;
        int iDegree2 = i3;
        while (iDegree > 0) {
            int iInvert = (Util.invert(integerPolynomial3.coeffs[iDegree], i) * integerPolynomial2.coeffs[iDegree2]) % i;
            int i4 = iDegree2 - iDegree;
            integerPolynomial2.multShiftSub(integerPolynomial3, iInvert, i4, i);
            integerPolynomial6.multShiftSub(integerPolynomial7, iInvert, i4, i);
            iDegree2 = integerPolynomial2.degree();
            if (iDegree2 < iDegree) {
                iPow = (iPow * Util.pow(integerPolynomial3.coeffs[iDegree], i3 - iDegree2, i)) % i;
                if (i3 % 2 == 1 && iDegree % 2 == 1) {
                    iPow = (-iPow) % i;
                }
                i3 = iDegree;
                iDegree = iDegree2;
                iDegree2 = i3;
                IntegerPolynomial integerPolynomial8 = integerPolynomial7;
                integerPolynomial7 = integerPolynomial6;
                integerPolynomial6 = integerPolynomial8;
                IntegerPolynomial integerPolynomial9 = integerPolynomial3;
                integerPolynomial3 = integerPolynomial2;
                integerPolynomial2 = integerPolynomial9;
            }
        }
        int iPow2 = (iPow * Util.pow(integerPolynomial3.coeffs[0], iDegree2, i)) % i;
        integerPolynomial7.mult(Util.invert(integerPolynomial3.coeffs[0], i));
        integerPolynomial7.mod(i);
        integerPolynomial7.mult(iPow2);
        integerPolynomial7.mod(i);
        int[] iArr3 = integerPolynomial7.coeffs;
        integerPolynomial7.coeffs = Arrays.copyOf(iArr3, iArr3.length - 1);
        return new ModularResultant(new BigIntPolynomial(integerPolynomial7), BigInteger.valueOf(iPow2), BigInteger.valueOf(i));
    }

    private void multShiftSub(IntegerPolynomial integerPolynomial, int i, int i2, int i3) {
        int length = this.coeffs.length;
        for (int i4 = i2; i4 < length; i4++) {
            int[] iArr = this.coeffs;
            iArr[i4] = (iArr[i4] - (integerPolynomial.coeffs[i4 - i2] * i)) % i3;
        }
    }

    private BigInteger squareSum() {
        BigInteger bigIntegerAdd = Constants.BIGINT_ZERO;
        int i = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i >= iArr.length) {
                return bigIntegerAdd;
            }
            int i2 = iArr[i];
            bigIntegerAdd = bigIntegerAdd.add(BigInteger.valueOf(i2 * i2));
            i++;
        }
    }

    public int degree() {
        int length = this.coeffs.length - 1;
        while (length > 0 && this.coeffs[length] == 0) {
            length--;
        }
        return length;
    }

    public void add(IntegerPolynomial integerPolynomial, int i) {
        add(integerPolynomial);
        mod(i);
    }

    public void add(IntegerPolynomial integerPolynomial) {
        int[] iArr = integerPolynomial.coeffs;
        int length = iArr.length;
        int[] iArr2 = this.coeffs;
        if (length > iArr2.length) {
            this.coeffs = Arrays.copyOf(iArr2, iArr.length);
        }
        int i = 0;
        while (true) {
            int[] iArr3 = integerPolynomial.coeffs;
            if (i >= iArr3.length) {
                return;
            }
            int[] iArr4 = this.coeffs;
            iArr4[i] = iArr4[i] + iArr3[i];
            i++;
        }
    }

    public void sub(IntegerPolynomial integerPolynomial, int i) {
        sub(integerPolynomial);
        mod(i);
    }

    public void sub(IntegerPolynomial integerPolynomial) {
        int[] iArr = integerPolynomial.coeffs;
        int length = iArr.length;
        int[] iArr2 = this.coeffs;
        if (length > iArr2.length) {
            this.coeffs = Arrays.copyOf(iArr2, iArr.length);
        }
        int i = 0;
        while (true) {
            int[] iArr3 = integerPolynomial.coeffs;
            if (i >= iArr3.length) {
                return;
            }
            int[] iArr4 = this.coeffs;
            iArr4[i] = iArr4[i] - iArr3[i];
            i++;
        }
    }

    public void sub(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i2 >= iArr.length) {
                return;
            }
            iArr[i2] = iArr[i2] - i;
            i2++;
        }
    }

    public void mult(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i2 >= iArr.length) {
                return;
            }
            iArr[i2] = iArr[i2] * i;
            i2++;
        }
    }

    private void mult2(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i2 >= iArr.length) {
                return;
            }
            int i3 = iArr[i2] * 2;
            iArr[i2] = i3;
            iArr[i2] = i3 % i;
            i2++;
        }
    }

    public void mult3(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i2 >= iArr.length) {
                return;
            }
            int i3 = iArr[i2] * 3;
            iArr[i2] = i3;
            iArr[i2] = i3 % i;
            i2++;
        }
    }

    public void div(int i) {
        int i2 = (i + 1) / 2;
        int i3 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i3 >= iArr.length) {
                return;
            }
            int i4 = iArr[i3];
            int i5 = i4 + (i4 > 0 ? i2 : -i2);
            iArr[i3] = i5;
            iArr[i3] = i5 / i;
            i3++;
        }
    }

    public void mod3() {
        int i = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i >= iArr.length) {
                return;
            }
            int i2 = iArr[i] % 3;
            iArr[i] = i2;
            if (i2 > 1) {
                iArr[i] = i2 - 3;
            }
            int i3 = iArr[i];
            if (i3 < -1) {
                iArr[i] = i3 + 3;
            }
            i++;
        }
    }

    public void modPositive(int i) {
        mod(i);
        ensurePositive(i);
    }

    public void modCenter(int i) {
        int i2;
        mod(i);
        for (int i3 = 0; i3 < this.coeffs.length; i3++) {
            while (true) {
                int[] iArr = this.coeffs;
                int i4 = iArr[i3];
                i2 = i / 2;
                if (i4 >= i2) {
                    break;
                } else {
                    iArr[i3] = i4 + i;
                }
            }
            while (true) {
                int[] iArr2 = this.coeffs;
                int i5 = iArr2[i3];
                if (i5 >= i2) {
                    iArr2[i3] = i5 - i;
                }
            }
        }
    }

    public void mod(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i2 >= iArr.length) {
                return;
            }
            iArr[i2] = iArr[i2] % i;
            i2++;
        }
    }

    public void ensurePositive(int i) {
        for (int i2 = 0; i2 < this.coeffs.length; i2++) {
            while (true) {
                int[] iArr = this.coeffs;
                int i3 = iArr[i2];
                if (i3 < 0) {
                    iArr[i2] = i3 + i;
                }
            }
        }
    }

    public long centeredNormSq(int i) {
        int length = this.coeffs.length;
        IntegerPolynomial integerPolynomial = (IntegerPolynomial) clone();
        integerPolynomial.shiftGap(i);
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        while (true) {
            int[] iArr = integerPolynomial.coeffs;
            if (i2 != iArr.length) {
                int i3 = iArr[i2];
                j2 += (long) i3;
                j += (long) (i3 * i3);
                i2++;
            } else {
                return j - ((j2 * j2) / ((long) length));
            }
        }
    }

    public void shiftGap(int i) {
        int i2;
        modCenter(i);
        int[] iArrClone = Arrays.clone(this.coeffs);
        sort(iArrClone);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < iArrClone.length - 1) {
            int i6 = i3 + 1;
            int i7 = iArrClone[i6];
            int i8 = iArrClone[i3];
            int i9 = i7 - i8;
            if (i9 > i4) {
                i5 = i8;
                i4 = i9;
            }
            i3 = i6;
        }
        int i10 = iArrClone[0];
        int i11 = iArrClone[iArrClone.length - 1];
        if ((i - i11) + i10 > i4) {
            i2 = (i11 + i10) / 2;
        } else {
            i2 = i5 + (i4 / 2) + (i / 2);
        }
        sub(i2);
    }

    private void sort(int[] iArr) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i != iArr.length - 1) {
                int i2 = iArr[i];
                int i3 = i + 1;
                int i4 = iArr[i3];
                if (i2 > i4) {
                    iArr[i] = i4;
                    iArr[i3] = i2;
                    z = true;
                }
                i = i3;
            }
        } while (z);
    }

    public void center0(int i) {
        for (int i2 = 0; i2 < this.coeffs.length; i2++) {
            while (true) {
                int[] iArr = this.coeffs;
                int i3 = iArr[i2];
                if (i3 >= (-i) / 2) {
                    break;
                } else {
                    iArr[i2] = i3 + i;
                }
            }
            while (true) {
                int[] iArr2 = this.coeffs;
                int i4 = iArr2[i2];
                if (i4 > i / 2) {
                    iArr2[i2] = i4 - i;
                }
            }
        }
    }

    public int sumCoeffs() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i >= iArr.length) {
                return i2;
            }
            i2 += iArr[i];
            i++;
        }
    }

    private boolean equalsZero() {
        int i = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i >= iArr.length) {
                return true;
            }
            if (iArr[i] != 0) {
                return false;
            }
            i++;
        }
    }

    public boolean equalsOne() {
        int i = 1;
        while (true) {
            int[] iArr = this.coeffs;
            if (i >= iArr.length) {
                return iArr[0] == 1;
            }
            if (iArr[i] != 0) {
                return false;
            }
            i++;
        }
    }

    private boolean equalsAbsOne() {
        int i = 1;
        while (true) {
            int[] iArr = this.coeffs;
            if (i >= iArr.length) {
                return Math.abs(iArr[0]) == 1;
            }
            if (iArr[i] != 0) {
                return false;
            }
            i++;
        }
    }

    public int count(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i2 == iArr.length) {
                return i3;
            }
            if (iArr[i2] == i) {
                i3++;
            }
            i2++;
        }
    }

    public void rotate1() {
        int[] iArr = this.coeffs;
        int i = iArr[iArr.length - 1];
        for (int length = iArr.length - 1; length > 0; length--) {
            int[] iArr2 = this.coeffs;
            iArr2[length] = iArr2[length - 1];
        }
        this.coeffs[0] = i;
    }

    public void clear() {
        int i = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial toIntegerPolynomial() {
        return (IntegerPolynomial) clone();
    }

    public Object clone() {
        return new IntegerPolynomial((int[]) this.coeffs.clone());
    }

    public boolean equals(Object obj) {
        if (obj instanceof IntegerPolynomial) {
            return Arrays.areEqual(this.coeffs, ((IntegerPolynomial) obj).coeffs);
        }
        return false;
    }

    public class ModResultantTask implements Callable<ModularResultant> {
        private int modulus;

        private ModResultantTask(int i) {
            this.modulus = i;
        }

        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        public ModularResultant call() {
            return IntegerPolynomial.this.resultant(this.modulus);
        }
    }

    public class CombineTask implements Callable<ModularResultant> {
        private ModularResultant modRes1;
        private ModularResultant modRes2;

        private CombineTask(ModularResultant modularResultant, ModularResultant modularResultant2) {
            this.modRes1 = modularResultant;
            this.modRes2 = modularResultant2;
        }

        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        public ModularResultant call() {
            return ModularResultant.combineRho(this.modRes1, this.modRes2);
        }
    }

    public class PrimeGenerator {
        private int index;
        private BigInteger prime;

        private PrimeGenerator() {
            this.index = 0;
        }

        public BigInteger nextPrime() {
            if (this.index < IntegerPolynomial.BIGINT_PRIMES.size()) {
                List list = IntegerPolynomial.BIGINT_PRIMES;
                int i = this.index;
                this.index = i + 1;
                this.prime = (BigInteger) list.get(i);
            } else {
                this.prime = this.prime.nextProbablePrime();
            }
            return this.prime;
        }
    }
}
