package de.sormuras.isometry;

/**
 * Namespace for the 4 bit Turtle Code and related constants.
 *
 * <p>Turtle Code tiles overview. Note <code>TC5</code> and <code>TCA</code> are invalid tile codes.
 * The <code>TCF</code> is just here to complete the set.
 *
 * <pre>
 * 0-------0  1-------0  0-------1  1-------1
 * | ~   ~ |  | \   ? |  | ?   / |  |: ..: .|
 * |   0   |  |   5   |  |   A   |  | .:F . |
 * | ~   ~ |  | ?   \ |  | /   ? |  |.. .::.|
 * 0-------0  0-------1  1-------0  1-------1
 *
 * 1-------0  0-------1  0-------0  0-------0
 * |.:.| ~ |  | ~ |..:|  | ~   ~ |  | ~   ~ |
 * |---1   |  |   2---|  |   4---|  |---8   |
 * | ~   ~ |  | ~   ~ |  | ~ |. :|  |. .| ~ |
 * 0-------0  0-------0  0-------1  1-------0
 *
 * 1-------1  0-------1  1-------0  0-------0
 * |: ..: .|  | ~ |: .|  |:..| ~ |  | ~   ~ |
 * |---3---|  |   6 .:|  |.:.9   |  |---C---|
 * | ~   ~ |  | ~ |.:.|  |. .| ~ |  |. :. .:|
 * 0-------0  0-------1  1-------0  1-------1
 *
 * 1-------1  1-------1  1-------0  0-------1
 * |: ..: .|  |: ..: .|  | ..| ~ |  | ~ | .:|
 * |---7.: |  |.:.B---|  |:. D---|  |---E  .|
 * | ~ |: .|  |. .| ~ |  | . ..:.|  |. :. . |
 * 0-------1  1-------0  1-------1  1-------1 All ASCII art is done with Jave3.
 * </pre>
 *
 * Three simple example shapes.
 *
 * <pre>
 * 0-------0-------0-------0-------0-------0-------0-------0
 * | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~   ~ |
 * |   0   |   0   |   4---|---8   |   0   |   0   |   0   |
 * | ~   ~ | ~   ~ | ~ |. :|. .| ~ | ~   ~ | ~   ~ | ~   ~ |
 * 0-------0-------0-------1-------0-------0-------0-------0
 * | ~   ~ | ~   ~ | ~ |..:|.:.| ~ | ~   ~ | ~   ~ | ~   ~ |
 * |   0   |   0   |   2---|---1   |   4---|---8   |   0   |
 * | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~ |. :|. .| ~ | ~   ~ |
 * 0-------0-------0-------0-------0-------1-------0-------0
 * | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~ | .:| ..| ~ | ~   ~ |
 * |   4---|---C---|---8   |   4---|---E  .|:. D---|---8   |
 * | ~ |. :|. :. .:|. .| ~ | ~ |. :|. :. . | . ..:.|. .| ~ |
 * 0-------1-------1-------0-------1-------1-------1-------0
 * | ~ |: .|: ..: .|:..| ~ | ~ |..:|: ..: .|: ..: .|.:.| ~ |
 * |   6 .:| .:F . |.:.9   |   2---|---7.: |.:.B---|---1   |
 * | ~ |.:.|.. .::.|. .| ~ | ~   ~ | ~ |: .|. .| ~ | ~   ~ |
 * 0-------1-------1-------0-------0-------1-------0-------0
 * | ~ |..:|: ..: .|.:.| ~ | ~   ~ | ~ |..:|.:.| ~ | ~   ~ |
 * |   2---|---3---|---1   |   0   |   2---|---1   |   0   |
 * | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~   ~ |
 * 0-------0-------0-------0-------0-------0-------0-------0
 * </pre>
 *
 * A more complex shape. It includes one hole which could be a lake.
 *
 * <pre>
 * 0-------0-------0-------0-------0-------0-------0-------0
 * | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~   ~ |
 * |   0   |   4---|---C---|---C---|---C---|---8   |   0   |
 * | ~   ~ | ~ |. :|. :. .:|. :. .:|. :. .:|. .| ~ | ~   ~ |
 * 0-------0-------1-------1-------1-------1-------0-------0
 * | ~   ~ | ~ |: .|: ..: .|: ..: .|: ..: .| ..| ~ | ~   ~ |
 * |   0   |   6 .:| .:F . | .:F . | .:F . |:. D---|---8   |
 * | ~   ~ | ~ |.:.|.. .::.|.. .::.|.. .::.| . ..:.|. .| ~ |
 * 0-------0-------1-------1-------1-------1-------1-------0
 * | ~   ~ | ~ |..:|: ..: .|: ..: .|: ..: .|: ..: .|:..| ~ |
 * |   0   |   2---|---7.: |.:.B---|---7.: | .:F . |.:.9   |
 * | ~   ~ | ~   ~ | ~ |: .|. .| ~ | ~ |: .|.. .::.|. .| ~ |
 * 0-------0-------0-------1-------0-------1-------1-------0
 * | ~   ~ | ~   ~ | ~ | .:|:..| ~ | ~ |..:|: ..: .|:..| ~ |
 * |   4---|---C---|---E  .|.:.9   |   2---|---7.: |.:.9   |
 * | ~ |. :|. :. .:|. :. . |. .| ~ | ~   ~ | ~ |: .|. .| ~ |
 * 0-------1-------1-------1-------0-------0-------1-------0
 * | ~ |..:|: ..: .|: ..: .| ..| ~ | ~   ~ | ~ | .:|:..| ~ |
 * |   2---|---7.: | .:F . |:. D---|---C---|---E  .|.:.9   |
 * | ~   ~ | ~ |: .|.. .::.| . ..:.|. :. .:|. :. . |. .| ~ |
 * 0-------0-------1-------1-------1-------1-------1-------0
 * | ~   ~ | ~ |..:|: ..: .|: ..: .|: ..: .|: ..: .|.:.| ~ |
 * |   0   |   2---|---3---|---3---|---3---|---3---|---1   |
 * | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~   ~ | ~   ~ |
 * 0-------0-------0-------0-------0-------0-------0-------0
 * </pre>
 *
 * @author Sormuras
 */
public enum TurtleCode {

  /**
   * Binary representation is 0000.
   *
   * <pre>
   * 0-------0
   * | ~   ~ |
   * |   0   |
   * | ~   ~ |
   * 0-------0
   * </pre>
   */
  TC0, // = 0x0;

  /**
   * Binary representation is 0001.
   *
   * <pre>
   * 1-------0
   * |.:.| ~ |
   * |---1   |
   * | ~   ~ |
   * 0-------0
   * </pre>
   */
  TC1, // = 0x1;

  /**
   * Binary representation is 0010.
   *
   * <pre>
   * 0-------1
   * | ~ |..:|
   * |   2---|
   * | ~   ~ |
   * 0-------0
   * </pre>
   */
  TC2, // = 0x2;

  /**
   * Binary representation is 0011.
   *
   * <pre>
   * 1-------1
   * |: ..: .|
   * |---3---|
   * | ~   ~ |
   * 0-------0
   * </pre>
   */
  TC3, // = 0x3;

  /**
   * Binary representation is 0100.
   *
   * <pre>
   * 0-------0
   * | ~   ~ |
   * |   4---|
   * | ~ |. :|
   * 0-------1
   * </pre>
   */
  TC4, // = 0x4;

  /**
   * Binary representation is 0101.
   *
   * <pre>
   * 1-------0
   * | \   ? |
   * |   5   |
   * | ?   \ |
   * 0-------1
   * </pre>
   */
  TC5, // = 0x5;

  /**
   * Binary representation is 0110.
   *
   * <pre>
   * 0-------1
   * | ~ |: .|
   * |   6 .:|
   * | ~ |.:.|
   * 0-------1
   * </pre>
   */
  TC6, // = 0x6;

  /**
   * Binary representation is 0111.
   *
   * <pre>
   * 1-------1
   * |: ..: .|
   * |---7.: |
   * | ~ |: .|
   * 0-------1
   * </pre>
   */
  TC7, // = 0x7;

  /**
   * Binary representation is 1000.
   *
   * <pre>
   * 0-------0
   * | ~   ~ |
   * |---8   |
   * |. .| ~ |
   * 1-------0
   * </pre>
   */
  TC8, // = 0x8;

  /**
   * Binary representation is 1001.
   *
   * <pre>
   * 1-------0
   * |:..| ~ |
   * |.:.9   |
   * |. .| ~ |
   * 1-------0
   * </pre>
   */
  TC9, // = 0x9;

  /**
   * Binary representation is 1010.
   *
   * <pre>
   * 0-------1
   * | ?   / |
   * |   A   |
   * | /   ? |
   * 1-------0
   * </pre>
   */
  TCA, // = 0xA;

  /**
   * Binary representation is 1011.
   *
   * <pre>
   * 1-------1
   * |: ..: .|
   * |.:.B---|
   * |. .| ~ |
   * 1-------0
   * </pre>
   */
  TCB, // = 0xB;

  /**
   * Binary representation is 1100.
   *
   * <pre>
   * 0-------0
   * | ~   ~ |
   * |---C---|
   * |. :. .:|
   * 1-------1
   * </pre>
   */
  TCC, // = 0xC;

  /**
   * Binary representation is 1101.
   *
   * <pre>
   * 1-------0
   * | ..| ~ |
   * |:. D---|
   * | . ..:.|
   * 1-------1
   * </pre>
   */
  TCD, // = 0xD;

  /**
   * Binary representation is 1110.
   *
   * <pre>
   * 0-------1
   * | ~ | .:|
   * |---E  .|
   * |. :. . |
   * 1-------1
   * </pre>
   */
  TCE, // = 0xE;

  /**
   * Binary representation is 1111.
   *
   * <pre>
   * 1-------1
   * |: ..: .|
   * | .:F . |
   * |.. .::.|
   * 1-------1
   * </pre>
   */
  TCF; // = 0xF;

  /** North move constant. */
  public static final int MOVE_NORTH = 0;

  /** East move constant. */
  public static final int MOVE_EAST = 1;

  /** South move constant. */
  public static final int MOVE_SOUTH = 2;

  /** West move constant. */
  public static final int MOVE_WEST = 3;

  /** First bit of the <code>TurtleCode</code> coding. */
  public static final int NORTH_WEST_BIT = 1;

  /** Second bit of the <code>TurtleCode</code> coding. */
  public static final int NORTH_EAST_BIT = 2;

  /** Third bit of the <code>TurtleCode</code> coding. */
  public static final int SOUTH_EAST_BIT = 4;

  /** Fourth bit of the <code>TurtleCode</code> coding. */
  public static final int SOUTH_WEST_BIT = 8;
}
