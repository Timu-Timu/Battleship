1. Создать enums
CellStatus {ALIVE, DEAD}
2. enum CellDeck {FIRST, SECOND}
3. enum MoveResult {HIT, MISS}
4. Создать класс Cell {Long id, int x, int y, CellStatus status, CellDeck deck, Game game},
добавить сеттеры, геттеры, пустой конструктор, конструктор без id, toString
5. Создать класс Move {Long id, Player player, int x, int y, MoveResult result, Game game, Date date},
добавить сеттеры, геттеры, пустой конструктор, конструктор без id, toString
6. Создать класс Game {Long id, Player firstPlayer, Player secondPlayer, Date date},
добавить сеттеры, геттеры, пустой конструктор, конструктор без id, toString
