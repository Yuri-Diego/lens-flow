-- Inserir dados na tabela tb_box
INSERT INTO tb_box (id_box, number, status, color) VALUES (100, 101, 'Free', 'Blue');
INSERT INTO tb_box (id_box, number, status, color) VALUES (200, 102, 'Occupied', 'Red');
INSERT INTO tb_box (id_box, number, status, color) VALUES (300, 103, 'Free', 'Green');
INSERT INTO tb_box (id_box, number, status, color) VALUES (400, 104, 'Occupied', 'Yellow');
INSERT INTO tb_box (id_box, number, status, color) VALUES (500, 105, 'Free', 'Purple');
INSERT INTO tb_box (id_box, number, status, color) VALUES (600, 106, 'Occupied', 'Orange');
INSERT INTO tb_box (id_box, number, status, color) VALUES (700, 107, 'Free', 'Pink');
INSERT INTO tb_box (id_box, number, status, color) VALUES (800, 108, 'Occupied', 'Brown');
INSERT INTO tb_box (id_box, number, status, color) VALUES (900, 109, 'Free', 'Gray');
INSERT INTO tb_box (id_box, number, status, color) VALUES (1000, 110, 'Occupied', 'Black');

-- Inserir dados na tabela tb_movement_sheet
INSERT INTO tb_movement_sheet (id_movement_sheet, creation_date) VALUES (1, '2023-10-01');
INSERT INTO tb_movement_sheet (id_movement_sheet, creation_date) VALUES (2, '2023-10-02');
INSERT INTO tb_movement_sheet (id_movement_sheet, creation_date) VALUES (3, '2023-10-03');
INSERT INTO tb_movement_sheet (id_movement_sheet, creation_date) VALUES (4, '2023-10-04');
INSERT INTO tb_movement_sheet (id_movement_sheet, creation_date) VALUES (5, '2023-10-05');

-- Inserir dados na tabela tb_movement
INSERT INTO tb_movement (id_movement, box_id, movement_sheet_id, client, order_service, completed, time) VALUES (1, 1, 1, 'Client A', 'Order 123', false, '2023-10-01 10:15:00');
INSERT INTO tb_movement (id_movement, box_id, movement_sheet_id, client, order_service, completed, time) VALUES (2, 2, 1, 'Client B', 'Order 456', true, '2023-10-01 10:30:00');
INSERT INTO tb_movement (id_movement, box_id, movement_sheet_id, client, order_service, completed, time) VALUES (3, 3, 2, 'Client C', 'Order 789', false, '2023-10-02 11:45:00');
INSERT INTO tb_movement (id_movement, box_id, movement_sheet_id, client, order_service, completed, time) VALUES (4, 4, 2, 'Client D', 'Order 101', true, '2023-10-02 12:00:00');
INSERT INTO tb_movement (id_movement, box_id, movement_sheet_id, client, order_service, completed, time) VALUES (5, 5, 3, 'Client E', 'Order 112', false, '2023-10-03 09:30:00');
INSERT INTO tb_movement (id_movement, box_id, movement_sheet_id, client, order_service, completed, time) VALUES (6, 6, 3, 'Client F', 'Order 131', true, '2023-10-03 10:00:00');
INSERT INTO tb_movement (id_movement, box_id, movement_sheet_id, client, order_service, completed, time) VALUES (7, 7, 4, 'Client G', 'Order 141', false, '2023-10-04 15:00:00');
INSERT INTO tb_movement (id_movement, box_id, movement_sheet_id, client, order_service, completed, time) VALUES (8, 8, 4, 'Client H', 'Order 151', true, '2023-10-04 15:30:00');
INSERT INTO tb_movement (id_movement, box_id, movement_sheet_id, client, order_service, completed, time) VALUES (9, 9, 5, 'Client I', 'Order 161', false, '2023-10-05 16:15:00');
INSERT INTO tb_movement (id_movement, box_id, movement_sheet_id, client, order_service, completed, time) VALUES (10, 10, 5, 'Client J', 'Order 171', true, '2023-10-05 16:45:00');