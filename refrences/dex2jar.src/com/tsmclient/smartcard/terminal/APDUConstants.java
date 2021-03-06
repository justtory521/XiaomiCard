package com.tsmclient.smartcard.terminal;

import com.tsmclient.smartcard.ByteArray;

public class APDUConstants
{
  public static final ByteArray AID_BMAC;
  public static final ByteArray AID_HZT;
  public static final ByteArray AID_LNT;
  public static final ByteArray AID_SPTC;
  public static final ByteArray AID_SUZHOUTONG;
  public static final ByteArray AID_SZT;
  public static final ByteArray AID_WHT;
  public static final CommandApdu COMM_PREFIX_ACTIVATE_CARD;
  public static final CommandApdu COMM_PREFIX_DEACTIVATE_CARD;
  public static final CommandApdu COMM_PREFIX_GET_STATUS;
  public static final CommandApdu COMM_PREFIX_INIT_UPDATE;
  public static final CommandApdu COMM_PREFIX_READ_RECORD;
  public static final CommandApdu COMM_TAG_GET_STATUS;
  public static final byte[] GET_SEID;
  public static final byte[] ISD;
  public static final int LENGTH_HOSTCHALLENGE = 16;
  public static final ByteArray NOT_EXISTS;
  public static byte[] PBOC_CARD_AID_PREFFIX;
  public static final byte[] SELECT_CRS;
  public static final byte[] SELECT_ISD;
  public static final byte[] SELECT_PPSE;
  public static final ByteArray TAG_AEF_ENTRANCE;
  public static final ByteArray TAG_AID;
  public static final ByteArray TAG_APP;
  public static final ByteArray TAG_BANK_CUSTOM_DATA;
  public static final ByteArray TAG_CARD_NUM;
  public static final ByteArray TAG_FCI_DATA_TEMPLATE;
  public static final ByteArray TAG_PDOL;

  static
  {
    byte[] arrayOfByte1 = new byte[2];
    arrayOfByte1[0] = 106;
    arrayOfByte1[1] = -126;
    NOT_EXISTS = ByteArray.wrap(arrayOfByte1);
    byte[] arrayOfByte2 = new byte[1];
    arrayOfByte2[0] = -91;
    TAG_FCI_DATA_TEMPLATE = ByteArray.wrap(arrayOfByte2);
    byte[] arrayOfByte3 = new byte[1];
    arrayOfByte3[0] = 97;
    TAG_AEF_ENTRANCE = ByteArray.wrap(arrayOfByte3);
    byte[] arrayOfByte4 = new byte[2];
    arrayOfByte4[0] = -65;
    arrayOfByte4[1] = 12;
    TAG_BANK_CUSTOM_DATA = ByteArray.wrap(arrayOfByte4);
    byte[] arrayOfByte5 = new byte[2];
    arrayOfByte5[0] = -97;
    arrayOfByte5[1] = 56;
    TAG_PDOL = ByteArray.wrap(arrayOfByte5);
    byte[] arrayOfByte6 = new byte[1];
    arrayOfByte6[0] = 79;
    TAG_AID = ByteArray.wrap(arrayOfByte6);
    byte[] arrayOfByte7 = new byte[1];
    arrayOfByte7[0] = 80;
    TAG_APP = ByteArray.wrap(arrayOfByte7);
    byte[] arrayOfByte8 = new byte[1];
    arrayOfByte8[0] = 87;
    TAG_CARD_NUM = ByteArray.wrap(arrayOfByte8);
    byte[] arrayOfByte9 = new byte[9];
    arrayOfByte9[0] = -96;
    arrayOfByte9[1] = 0;
    arrayOfByte9[2] = 0;
    arrayOfByte9[3] = 0;
    arrayOfByte9[4] = 3;
    arrayOfByte9[5] = -122;
    arrayOfByte9[6] = -104;
    arrayOfByte9[7] = 7;
    arrayOfByte9[8] = 1;
    AID_SPTC = ByteArray.wrap(arrayOfByte9);
    byte[] arrayOfByte10 = new byte[8];
    arrayOfByte10[0] = 89;
    arrayOfByte10[1] = 67;
    arrayOfByte10[2] = 84;
    arrayOfByte10[3] = 46;
    arrayOfByte10[4] = 85;
    arrayOfByte10[5] = 83;
    arrayOfByte10[6] = 69;
    arrayOfByte10[7] = 82;
    AID_LNT = ByteArray.wrap(arrayOfByte10);
    byte[] arrayOfByte11 = new byte[14];
    arrayOfByte11[0] = 83;
    arrayOfByte11[1] = 90;
    arrayOfByte11[2] = 84;
    arrayOfByte11[3] = 46;
    arrayOfByte11[4] = 87;
    arrayOfByte11[5] = 65;
    arrayOfByte11[6] = 76;
    arrayOfByte11[7] = 76;
    arrayOfByte11[8] = 69;
    arrayOfByte11[9] = 84;
    arrayOfByte11[10] = 46;
    arrayOfByte11[11] = 69;
    arrayOfByte11[12] = 78;
    arrayOfByte11[13] = 86;
    AID_SZT = ByteArray.wrap(arrayOfByte11);
    byte[] arrayOfByte12 = new byte[8];
    arrayOfByte12[0] = -111;
    arrayOfByte12[1] = 86;
    arrayOfByte12[2] = 0;
    arrayOfByte12[3] = 0;
    arrayOfByte12[4] = 20;
    arrayOfByte12[5] = 1;
    arrayOfByte12[6] = 0;
    arrayOfByte12[7] = 1;
    AID_BMAC = ByteArray.wrap(arrayOfByte12);
    byte[] arrayOfByte13 = new byte[8];
    arrayOfByte13[0] = 83;
    arrayOfByte13[1] = 85;
    arrayOfByte13[2] = 88;
    arrayOfByte13[3] = 73;
    arrayOfByte13[4] = 78;
    arrayOfByte13[5] = 46;
    arrayOfByte13[6] = 77;
    arrayOfByte13[7] = 70;
    AID_SUZHOUTONG = ByteArray.wrap(arrayOfByte13);
    byte[] arrayOfByte14 = new byte[9];
    arrayOfByte14[0] = -96;
    arrayOfByte14[1] = 0;
    arrayOfByte14[2] = 0;
    arrayOfByte14[3] = 83;
    arrayOfByte14[4] = 66;
    arrayOfByte14[5] = 87;
    arrayOfByte14[6] = 72;
    arrayOfByte14[7] = 84;
    arrayOfByte14[8] = 75;
    AID_WHT = ByteArray.wrap(arrayOfByte14);
    byte[] arrayOfByte15 = new byte[14];
    arrayOfByte15[0] = 49;
    arrayOfByte15[1] = 80;
    arrayOfByte15[2] = 85;
    arrayOfByte15[3] = 66;
    arrayOfByte15[4] = 46;
    arrayOfByte15[5] = 83;
    arrayOfByte15[6] = 89;
    arrayOfByte15[7] = 83;
    arrayOfByte15[8] = 46;
    arrayOfByte15[9] = 68;
    arrayOfByte15[10] = 68;
    arrayOfByte15[11] = 70;
    arrayOfByte15[12] = 48;
    arrayOfByte15[13] = 49;
    AID_HZT = ByteArray.wrap(arrayOfByte15);
    byte[] arrayOfByte16 = new byte[13];
    arrayOfByte16[0] = 0;
    arrayOfByte16[1] = -92;
    arrayOfByte16[2] = 4;
    arrayOfByte16[3] = 0;
    arrayOfByte16[4] = 8;
    arrayOfByte16[5] = -96;
    arrayOfByte16[6] = 0;
    arrayOfByte16[7] = 0;
    arrayOfByte16[8] = 1;
    arrayOfByte16[9] = 81;
    arrayOfByte16[10] = 0;
    arrayOfByte16[11] = 0;
    arrayOfByte16[12] = 0;
    SELECT_ISD = arrayOfByte16;
    byte[] arrayOfByte17 = new byte[14];
    arrayOfByte17[0] = 0;
    arrayOfByte17[1] = -92;
    arrayOfByte17[2] = 4;
    arrayOfByte17[3] = 0;
    arrayOfByte17[4] = 9;
    arrayOfByte17[5] = -96;
    arrayOfByte17[6] = 0;
    arrayOfByte17[7] = 0;
    arrayOfByte17[8] = 1;
    arrayOfByte17[9] = 81;
    arrayOfByte17[10] = 67;
    arrayOfByte17[11] = 82;
    arrayOfByte17[12] = 83;
    arrayOfByte17[13] = 0;
    SELECT_CRS = arrayOfByte17;
    byte[] arrayOfByte18 = new byte[19];
    arrayOfByte18[0] = 0;
    arrayOfByte18[1] = -92;
    arrayOfByte18[2] = 4;
    arrayOfByte18[3] = 0;
    arrayOfByte18[4] = 14;
    arrayOfByte18[5] = 50;
    arrayOfByte18[6] = 80;
    arrayOfByte18[7] = 65;
    arrayOfByte18[8] = 89;
    arrayOfByte18[9] = 46;
    arrayOfByte18[10] = 83;
    arrayOfByte18[11] = 89;
    arrayOfByte18[12] = 83;
    arrayOfByte18[13] = 46;
    arrayOfByte18[14] = 68;
    arrayOfByte18[15] = 68;
    arrayOfByte18[16] = 70;
    arrayOfByte18[17] = 48;
    arrayOfByte18[18] = 49;
    SELECT_PPSE = arrayOfByte18;
    byte[] arrayOfByte19 = new byte[5];
    arrayOfByte19[0] = -128;
    arrayOfByte19[1] = -54;
    arrayOfByte19[2] = -97;
    arrayOfByte19[3] = 127;
    arrayOfByte19[4] = 0;
    GET_SEID = arrayOfByte19;
    byte[] arrayOfByte20 = new byte[7];
    arrayOfByte20[0] = -96;
    arrayOfByte20[1] = 0;
    arrayOfByte20[2] = 0;
    arrayOfByte20[3] = 3;
    arrayOfByte20[4] = 51;
    arrayOfByte20[5] = 1;
    arrayOfByte20[6] = 1;
    PBOC_CARD_AID_PREFFIX = arrayOfByte20;
    COMM_PREFIX_INIT_UPDATE = new CommandApdu(128, 80, 33, 0);
    COMM_PREFIX_ACTIVATE_CARD = new CommandApdu(128, 240, 1, 1);
    COMM_PREFIX_DEACTIVATE_CARD = new CommandApdu(128, 240, 1, 0);
    COMM_PREFIX_GET_STATUS = new CommandApdu(128, 242, 64, 0);
    COMM_TAG_GET_STATUS = new CommandApdu(92, 3, 79, 159, 112);
    COMM_PREFIX_READ_RECORD = new CommandApdu(0, 178, 1, 12);
    byte[] arrayOfByte21 = new byte[8];
    arrayOfByte21[0] = -96;
    arrayOfByte21[1] = 0;
    arrayOfByte21[2] = 0;
    arrayOfByte21[3] = 1;
    arrayOfByte21[4] = 81;
    arrayOfByte21[5] = 0;
    arrayOfByte21[6] = 0;
    arrayOfByte21[7] = 0;
    ISD = arrayOfByte21;
  }
}

/* Location:           d:\Users\Administrator\Desktop\111111_dex2jar.jar
 * Qualified Name:     com.tsmclient.smartcard.terminal.APDUConstants
 * JD-Core Version:    0.6.0
 */